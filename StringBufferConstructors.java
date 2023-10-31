import javax.swing.*;

public class StringBufferConstructors {
   public static void main( String args[] )
   {
      StringBuffer buf1, buf2, buf3;  
      buf1 = new StringBuffer();
      buf2 = new StringBuffer( 10 );
      buf3 = new StringBuffer( "hello" );
      String output =
         "buf1 = " + "\"" + buf1.toString() + "\"" +
         "\nbuf2 = " + "\"" + buf2.toString() + "\"" +
         "\nbuf3 = " + "\"" + buf3.toString() + "\"";
      JOptionPane.showMessageDialog( null, output,
         "Demonstrating StringBuffer Class Constructors",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
