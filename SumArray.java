import javax.swing.*;

public class SumArray {
   public static void main( String args[] )
   {
      int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      int total = 0;
      for ( int i = 0; i < a.length; i++ ) 
         total += a[ i ];
      JOptionPane.showMessageDialog( null, 
         "Total of array elements: " + total,
         "Sum the Elements of an Array",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
