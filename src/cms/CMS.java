
package cms;

import javax.swing.JOptionPane;

public class CMS {
 public static void main(String[] args)
 {
        try 
                 {
                   for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
                   {
                        if ("Nimbus".equals(info.getName())) 
                        {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                   }
                } 
                catch (Exception ex) 
                {
                     JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
                }
       projlogin obj=new projlogin();
        obj.setVisible(true);
        
    }
    
}
