/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.accountant;

import java.sql.*;
import static cms.connectivity.PASS;
import static cms.connectivity.URL;
import static cms.connectivity.USER;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class updatefee extends javax.swing.JInternalFrame {

    /**
     * Creates new form updatefee
     */
    public updatefee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Update Fee");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 115, 132, -1));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 153, 132, -1));

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 194, 132, -1));

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 232, 132, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 36, 60, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("sem");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 79, 40, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fees");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 118, 50, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Examination Fee");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 153, 100, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Addmission Fee");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 194, 100, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fund");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 235, 50, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select course", "BCA", "B.COM", "BBA", "MCA", "M.COM", "MBA" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 36, 102, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester", "1", "2", "3", "4", "5", "6" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 76, -1, -1));

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 270, -1, -1));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 47, 115, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_background.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 520, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
        Connection conn=DriverManager.getConnection(URL,USER,PASS);
        String q1="select * from fee where course=? and sem=?";
        PreparedStatement smt=conn.prepareStatement(q1);
        smt.setString(1,jComboBox1.getSelectedItem().toString());
        smt.setString(2,jComboBox2.getSelectedItem().toString());
        ResultSet rs=smt.executeQuery();
        if(rs.next())
        {
        jTextField1.setText(String.valueOf(rs.getFloat("fee")));
        jTextField2.setText(String.valueOf(rs.getString("exam_fee")));
        jTextField3.setText(String.valueOf(rs.getString("adm_fee")));
        jTextField4.setText(String.valueOf(rs.getString("fund")));
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, " Error : "+e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String course=(String)jComboBox1.getSelectedItem();
        String sem=(String)jComboBox2.getSelectedItem();
        float fee=Float.parseFloat(jTextField1.getText());
        float exam_fee=Float.parseFloat(jTextField2.getText());
        float adm_fee=Float.parseFloat(jTextField3.getText());
        float fund=Float.parseFloat(jTextField4.getText());
        try
        {

            Connection conn=DriverManager.getConnection(URL,USER,PASS);
            String a1="update fee set fee=?,exam_fee=?,adm_fee=?,fund=? where course=? and sem=?";
            PreparedStatement s1=conn.prepareStatement(a1);
            //s1.execute("insert into fee(course,sem,fee,exam_fee,adm_fee,fund) values ('"+course+"','"+sem+"','"+fee+"','"+exam_fee+"','"+adm_fee+"','"+fund+"');");
           s1.setFloat(1,Float.parseFloat(jTextField1.getText()));
            s1.setFloat(2,Float.parseFloat(jTextField2.getText()));
             s1.setFloat(3,Float.parseFloat(jTextField3.getText()));
              s1.setFloat(4,Float.parseFloat(jTextField4.getText()));
              s1.setString(5,jComboBox1.getSelectedItem().toString());
                s1.setString(6,jComboBox2.getSelectedItem().toString());
        int rs=s1.executeUpdate();
        if(rs==1)
        {
            JOptionPane.showMessageDialog(null,"Updated  Fee .....");
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null," "+e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
       if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE)))
        {
            evt.consume();
            //jLabel9.setForeground(Color.red);
            JOptionPane.showMessageDialog(null," Enter Only Digits (0-9) ");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
       if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE)))
        {
            evt.consume();
            //jLabel9.setForeground(Color.red);
            JOptionPane.showMessageDialog(null," Enter Only Digits (0-9) ");
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
       if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE)))
        {
            evt.consume();
            //jLabel9.setForeground(Color.red);
            JOptionPane.showMessageDialog(null," Enter Only Digits (0-9) ");
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
       if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE)))
        {
            evt.consume();
            //jLabel9.setForeground(Color.red);
            JOptionPane.showMessageDialog(null," Enter Only Digits (0-9) ");
        }
    }//GEN-LAST:event_jTextField4KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
