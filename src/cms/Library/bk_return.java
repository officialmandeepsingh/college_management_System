/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.Library;

import java.sql.*;
import cms.connectivity;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class bk_return extends javax.swing.JInternalFrame implements connectivity{

    /**
     * Creates new form bk_return
     */
    public bk_return() {
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Book Return");
        setToolTipText(" Book Return");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Roll No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 17, 90, 20));

        jTextField1.setToolTipText("Enter here Roll No");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 137, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, 80, -1));

        jTextField2.setEditable(false);
        jTextField2.setToolTipText("Book Name");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student Name ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 140, -1));

        jTextField3.setEditable(false);
        jTextField3.setToolTipText("Student Name");
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 10, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 52, 60, -1));

        jTextField4.setEditable(false);
        jTextField4.setToolTipText("Book Id");
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Course");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 100, -1));

        jTextField5.setEditable(false);
        jTextField5.setToolTipText("Course");
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 50, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date Of Issue");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, -1));

        jTextField6.setEditable(false);
        jTextField6.setToolTipText("Date Of issue");
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Semester");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 110, -1));

        jTextField7.setEditable(false);
        jTextField7.setToolTipText("Semester");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 90, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Book Issue Upto");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 131, 130, -1));

        jTextField8.setEditable(false);
        jTextField8.setToolTipText("Book Valid Up to");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 130, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_background.jpg"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 160));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 590, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jButton2.setText("Return");
        jButton2.setEnabled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 639, 322));

        setBounds(0, 0, 656, 355);
    }// </editor-fold>//GEN-END:initComponents
void clear()
{
jTextField1.setText(null);
jTextField2.setText(null);
jTextField3.setText(null);
jTextField4.setText(null);
jTextField5.setText(null);
jTextField6.setText(null);
jTextField7.setText(null);
jTextField8.setText(null);
}
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed
    int avail;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
        Connection conn=DriverManager.getConnection(URL, USER, PASS);
        String q1="select * from bkissue where roll_no=?";
        
        PreparedStatement smt=conn.prepareStatement(q1);
        
        smt.setString(1,jTextField1.getText());
       
        ResultSet rs=smt.executeQuery();
        if(rs.next())
            {
                jButton2.setEnabled(true);
                jTextField2.setText(rs.getString("Bk_name"));
                jTextField3.setText(rs.getString("s_name"));
                jTextField4.setText(rs.getString("Bookid"));
                jTextField5.setText(rs.getString("s_course"));
                jTextField6.setText(rs.getDate("date_issue").toString());
                jTextField7.setText(rs.getString("sem"));
                jTextField8.setText(rs.getDate("valid_bk").toString());
            }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, " Error: "+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
        Connection conn=DriverManager.getConnection(URL, USER, PASS);
        String q2="insert into bkreturn values (?,?,?,?,?,?,?,?)";
        String q1="delete from bkissue where roll_no=?";
        String q3="update books set book_avail=? where book_id=?";
        String ver=JOptionPane.showInputDialog(rootPane, " RE-Enter a Student Roll No. for verification ");
        PreparedStatement smt=conn.prepareStatement(q1);
        PreparedStatement smt2=conn.prepareStatement(q2);
        PreparedStatement smt3=conn.prepareStatement(q3);
        
        smt.setString(1,ver);
        
        smt2.setString(1, jTextField1.getText());
        smt2.setString(2, jTextField2.getText());
        smt2.setString(3, jTextField4.getText());
        smt2.setString(4, jTextField6.getText());
        smt2.setString(5, jTextField8.getText());
        smt2.setString(6, jTextField3.getText());
        smt2.setString(7, jTextField5.getText());
        smt2.setString(8, jTextField7.getText());
       
        smt3.setInt(1,avail);
        smt3.setString(2, jTextField4.getText());
       
        int rs=smt2.executeUpdate();
        if(rs==1)
            {
                int rs2=smt.executeUpdate();
                if(rs2==1)
                {
                   int rs3=smt3.executeUpdate();
              JOptionPane.showMessageDialog(rootPane," Book Return .....\n Thank You ");
                clear();
                }
            }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, " Error : "+e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE)))
        {
            evt.consume();
        JOptionPane.showMessageDialog(rootPane, " Enter only Digits (0-9) ");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
      try
      {
      Connection conn=DriverManager.getConnection(URL, USER, PASS);
      String q1="select * from books where book_id=?";
      PreparedStatement smt=conn.prepareStatement(q1);
      smt.setString(1,jTextField4.getText());
      ResultSet rs=smt.executeQuery();
      if(rs.next())
      {
      avail=rs.getInt("book_avail");
      avail=avail+1;
      //JOptionPane.showMessageDialog(rootPane, " "+avail);
      }
      }
      catch(Exception e)
      {
      JOptionPane.showMessageDialog(rootPane, " Error : "+e.getMessage());
      }
    }//GEN-LAST:event_jButton2MouseEntered

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
