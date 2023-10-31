import javax.swing.*;

public class StringMisc {
   public static void main( String args[] )
   {
      String s1, output;
      char charArray[];
      s1 = new String( "hello there" );
      charArray = new char[ 5 ];
      output = "s1: " + s1;
      output += "\nLength of s1: " + s1.length();
      output += "\nThe string reversed is: ";
      for ( int i = s1.length() - 1; i >= 0; i-- )
         output += s1.charAt( i ) + " ";
      s1.getChars( 0, 5, charArray, 0 );
      output += "\nThe character array is: ";
      for ( int i = 0; i < charArray.length;i++ )
         output += charArray[ i ];
      JOptionPane.showMessageDialog( null, output,
         "Demonstrating String Class Constructors",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
