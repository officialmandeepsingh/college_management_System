/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.accountant;
import java.sql.*;
import cms.connectivity;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class setfee extends javax.swing.JInternalFrame implements connectivity{

    /**
     * Creates new form setfee
     */
    public setfee() {
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Set Fee");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setToolTipText("Enter a Tution Fee");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 113, 132, -1));

        jTextField2.setToolTipText("Enter a Examination Fee");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 151, 132, -1));

        jTextField3.setToolTipText("Enter a Addmission Fee");
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 192, 132, -1));

        jTextField4.setToolTipText("Enter a College Fund");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 230, 132, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 287, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 34, 60, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("sem");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 77, 40, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fees");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 116, 50, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Examination Fee");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 151, 100, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Addmission Fee");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 192, 100, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fund");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 233, 50, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select course", "BCA", "B.COM", "BBA", "MCA", "M.COM", "MBA" }));
        jComboBox1.setToolTipText("Choose a Course");
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 34, 102, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester", "1", "2", "3", "4", "5", "6" }));
        jComboBox2.setToolTipText("Choose a Semester");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 74, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_background.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 390, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents
boolean valid()
{
if(jComboBox1.getSelectedItem()=="select course")
{
    JOptionPane.showMessageDialog(rootPane, " Select Your Course");
    return(false);
}
else if(jComboBox2.getSelectedItem()=="Select Semester")
{
    JOptionPane.showMessageDialog(rootPane, " Select Your Semester");
    return(false);
}
else if(jTextField1.getText().isEmpty()||jTextField1.getText().length()<3)
{
    JOptionPane.showMessageDialog(rootPane, " Enter a Tuttion Fee");
    return(false);
}
else if(jTextField2.getText().isEmpty()||jTextField2.getText().length()<3)
{
    JOptionPane.showMessageDialog(rootPane, " Enter a Examination Fee");
    return(false);
}
else if(jTextField3.getText().isEmpty()||jTextField3.getText().length()<1)
{
    JOptionPane.showMessageDialog(rootPane, " Enter a Addmission  Fee");
    return(false);
}
else if(jTextField4.getText().isEmpty()||jTextField4.getText().length()<3)
{
    JOptionPane.showMessageDialog(rootPane, " Enter a College Fund");
    return(false);
}
else
{
    return(true);
}
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String course=(String)jComboBox1.getSelectedItem();
        String sem=(String)jComboBox2.getSelectedItem();
        float fee=Float.parseFloat(jTextField1.getText());
        float exam_fee=Float.parseFloat(jTextField2.getText());
        float adm_fee=Float.parseFloat(jTextField3.getText());
        float fund=Float.parseFloat(jTextField4.getText());
       if(valid()==true)
       {
               try
        {
           
            Connection conn=DriverManager.getConnection(URL,USER,PASS);
            String q1="insert into fee values (?,?,?,?,?,?)";
            String q2="select * from fee where course=? and sem=?";
            
            PreparedStatement s1=conn.prepareStatement(q1);
            PreparedStatement s2=conn.prepareStatement(q2);
            
            s1.setString(1, course);
            s1.setString(2, sem);
            s1.setFloat(3, fee);
            s1.setFloat(4, exam_fee);
            s1.setFloat(5, adm_fee);
            s1.setFloat(6,fund);
            
            s2.setString(1, course);
            s2.setString(2, sem);
            
            ResultSet rs2=s2.executeQuery();
            int rs=s1.executeUpdate();
           
            if(rs2.next())
            {
            JOptionPane.showMessageDialog(rootPane, " This Course & Semester fee already Existing ");
            }
            else
            {
           if(rs==1)
           {
           JOptionPane.showMessageDialog(null,"Add Fee in Database.....");
            }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null," "+e.getMessage());
        }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
    private javax.swing.JButton jButton1;
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