import javax.swing.*;

public class StringBufferChars {
   public static void main( String args[] )
   {
      StringBuffer buf = new StringBuffer( "hello there" );

      String output = "buf = " + buf.toString() +
                      "\nCharacter at 0: " + buf.charAt( 0 ) +
                      "\nCharacter at 4: " + buf.charAt( 4 );
      char charArray[] = new char[ buf.length() ];
      buf.getChars( 0, buf.length(), charArray, 0 );
      output += "\n\nThe characters are: ";
      for ( int i = 0; i < charArray.length; ++i )
         output += charArray[ i ];
      buf.setCharAt( 0, 'H' );
      buf.setCharAt( 6, 'T' );
      output += "\n\nbuf = " + buf.toString();
      buf.reverse();
      output += "\n\nbuf = " + buf.toString();
      JOptionPane.showMessageDialog( null, output,
         "Demonstrating StringBuffer Character Methods",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
