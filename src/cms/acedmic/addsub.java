/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.acedmic;
import java.sql.*;
import cms.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class addsub extends javax.swing.JInternalFrame implements connectivity{

    /**
     * Creates new form addmarks
     */
    public addsub() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Add Subjects");
        setToolTipText("Add Subjects");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Subject Code");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 32, 110, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextField1.setToolTipText("Entered Numeric values 3 to 7 Digits");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 29, 148, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subject Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 73, 110, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextField2.setToolTipText("Enter a Alphabets limit 3 to 30 characters");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 70, 148, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 111, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Semester");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 149, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 187, 110, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTextField6.setToolTipText("Enter Numeric value limits upto 3 digits");
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 225, 148, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Maximum Marks");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 228, 116, -1));

        jButton1.setText("Add Subject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 304, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose Subject Course", "BCA", "BBA", "B.COM", "M.SC(MATH)", "M.COM", "MBA(TYC)", "MCA", "MBA" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 111, 148, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Subject Semester", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 149, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Subject Type", "Theory", "Practical" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 187, 148, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_background.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 350));

        setBounds(0, 0, 436, 384);
    }// </editor-fold>//GEN-END:initComponents
void clear()
{
jTextField1.setText(null);
jTextField2.setText(null);
jTextField6.setText(null);
jComboBox1.setSelectedIndex(0);
jComboBox2.setSelectedIndex(0);
jComboBox3.setSelectedIndex(0);
}
boolean valid()
{
    if(jTextField1.getText().isEmpty()||jTextField1.getText().length()>7 ||jTextField1.getText().length()<3)
    {
        JOptionPane.showMessageDialog(rootPane,"Enter Subject Code !! ");
        return(false);
    }
    if(jTextField2.getText().isEmpty()||jTextField1.getText().length()>30 ||jTextField1.getText().length()<3)
    {
        JOptionPane.showMessageDialog(rootPane,"Enter Subject Name !! ");
        return(false);
    }
      
    if(jTextField6.getText().isEmpty() ||jTextField1.getText().length()<3)
    {
        JOptionPane.showMessageDialog(rootPane,"Enter Subject Maximum Marks !! ");
        return(false);
    }
   
    else
        {
        return(true);
        }
}


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(valid()==true)
        {
            try
            {
                Connection conn=DriverManager.getConnection(URL, USER, PASS);
                try
                {
               
                String q1="insert into subjects values (?,?,?,?,?,?)";
               PreparedStatement smt= conn.prepareStatement(q1);
               smt.setString(1,jTextField1.getText());
                smt.setString(2,jTextField2.getText());
                smt.setString(3,jComboBox1.getSelectedItem().toString());
                smt.setString(4,jComboBox2.getSelectedItem().toString());
                smt.setString(5,jComboBox3.getSelectedItem().toString());
                smt.setString(6,jTextField6.getText());
                int rs=smt.executeUpdate();
                    if(rs==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, " Subject Added Succcessfully ");
                        clear();
                    }
                   else
                    {
                      JOptionPane.showMessageDialog(rootPane, " Subject Not Added Succcessfully ");
                    }
                }
                catch(Exception e)
                {
                JOptionPane.showMessageDialog(rootPane, "error : "+e.getMessage());
                }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "error : "+e.getMessage());

            }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE )))
       {
            evt.consume();
            JOptionPane.showMessageDialog(null, " Enter only Digits (0-9) ");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE )))
        {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, " Enter only Alphabetics (a-z) ");
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE )))
             {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, " Enter only Digits (0-9) ");
        }
    }//GEN-LAST:event_jTextField6KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
