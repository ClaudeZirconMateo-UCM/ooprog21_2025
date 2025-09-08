import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {

   public static void main(String[] a) {
      String name = "";             
           int confirmn = 1;
      
      do {
         name = JOptionPane.showInputDialog(null, "Enter your name:");
         
         if (name == null) {
            break;
         }
           
         else {
         confirmn = JOptionPane.showConfirmDialog(null, "proceed with this name? " + name + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
         }
      } while (confirmn == JOptionPane.NO_OPTION);
   
      if (name != null) {
         JOptionPane.showMessageDialog(null, "Greetings " + name);
      }
   }
}     