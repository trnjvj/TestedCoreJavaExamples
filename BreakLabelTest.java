import javax.swing.JOptionPane;

public class BreakLabelTest {
   public static void main( String args[] )
   {
      String output = "";
      stop: {  
         for ( int row = 1; row <= 10; row++ ) {
            for ( int column = 1; column <= 5 ; column++ ) {
               if ( row == 5 )
                  break stop; 
               output += "*  ";
            }
            output += "\n";
         }
         output += "\nLoops terminated normally";
      }
      JOptionPane.showMessageDialog(
         null, output,"Testing break with a label",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
