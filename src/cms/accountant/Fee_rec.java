/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.accountant;

import java.sql.*;
import javax.swing.JOptionPane;
import cms.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Dell
 */
public class Fee_rec extends javax.swing.JInternalFrame implements connectivity{

    /**
     * Creates new form Fee_rec
     */
    public Fee_rec() {
        initComponents();
        this.setLocation(200, 50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Fee Record");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 32, 125, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose Start Date ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 32, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose Ending Date ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 35, 129, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 32, 125, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 29, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll No", "Stu. Name", "Course", "Date Of Payment", "Total Fees"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 724, 316));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 400));

        setBounds(0, 0, 778, 431);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        try
        {
        Connection conn=DriverManager.getConnection(URL,USER,PASS);
        String q1="select * from payments where date between ? and ? order by date";
        PreparedStatement smt=conn.prepareStatement(q1);
         SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
         String stdt = myformat.format(jDateChooser1.getDate());
         String enddt = myformat.format(jDateChooser2.getDate());
         smt.setString(1,stdt);
         smt.setString(2,enddt);
         ResultSet rs=smt.executeQuery();
         DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
         if(rs.next())
         {
             
            do
            {
                String sname=rs.getString("name");
                String course=rs.getString("course");
                String sem=rs.getString("sem");
                String rollno=rs.getString("Roll_no");
                
                String cls=" "+course+"   "+sem+" ";
                Float ttl=rs.getFloat("total_fee");
                String date=rs.getString("date");
                Object myrow[]={rollno,sname,cls,date,ttl};
                model.addRow(myrow);
            }while(rs.next());
         }
        }
        catch(Exception e)
        {
            
        JOptionPane.showMessageDialog(rootPane,"Error : "+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
