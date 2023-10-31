import javax.swing.JOptionPane;

public class BreakTest {
   public static void main( String args[] )
   {
      String output = "";
      int count;
      for ( count = 1; count <= 10; count++ ) {
         if ( count == 5 )
            break;  
         output += count + " ";
      }
      output += "\nBroke out of loop at count = " + count;
      JOptionPane.showMessageDialog( null, output );
      System.exit( 0 );
   }
}
