import javax.swing.*;

public class StringBufferCapLen {
   public static void main( String args[] )
   {
      StringBuffer buf =
         new StringBuffer( "Hello, how are you?" );
      String output = "buf = " + buf.toString() +
                      "\nlength = " + buf.length() +
                      "\ncapacity = " + buf.capacity();
      buf.ensureCapacity( 75 );
      output += "\n\nNew capacity = " + buf.capacity();
      buf.setLength( 10 );
      output += "\n\nNew length = " + buf.length() +
                "\nbuf = " + buf.toString();
      JOptionPane.showMessageDialog( null, output,
         "StringBuffer length and capacity Methods",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
