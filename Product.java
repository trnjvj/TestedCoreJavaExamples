import javax.swing.JOptionPane;

public class Product {
   public static void main( String args[] )
   {
      int x, y, z, result;
      String xVal, yVal, zVal;

      xVal = JOptionPane.showInputDialog(
                "Enter first integer:" );
      yVal = JOptionPane.showInputDialog(
                "Enter second integer:" );
      zVal = JOptionPane.showInputDialog(
                "Enter third integer:" );
      x = Integer.parseInt( xVal );
      y = Integer.parseInt( yVal );
      z = Integer.parseInt( zVal );
      result = x * y * z;
      JOptionPane.showMessageDialog( null,
         "The product is " + result );
      System.exit( 0 );
   }
}
