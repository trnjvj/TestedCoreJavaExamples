import javax.swing.*;

public class StringHashCode {
   public static void main( String args[] )
   {
      String s1 = "hello",
             s2 = "Hello";
      String output =
         "The hash code for \"" + s1 + "\" is " +
         s1.hashCode() + 
         "\nThe hash code for \"" + s2 + "\" is " +
         s2.hashCode();
      JOptionPane.showMessageDialog( null, output,
         "Demonstrating String Method hashCode",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
