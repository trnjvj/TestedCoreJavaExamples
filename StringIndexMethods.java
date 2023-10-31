import javax.swing.*;

public class StringIndexMethods {
   public static void main( String args[] )
   {
      String letters = "abcdefghijklmabcdefghijklm";
      String output;
      output = "'c' is located at index " +
               letters.indexOf( 'c' );
      output += "\n'a' is located at index " +
                letters.indexOf( 'a', 1 );
      output += "\n'$' is located at index " +
                letters.indexOf( '$' );
      output += "\n\nLast 'c' is located at index " +
                letters.lastIndexOf( 'c' );
      output += "\nLast 'a' is located at index " +
                letters.lastIndexOf( 'a', 25 );
      output += "\nLast '$' is located at index " +
                letters.lastIndexOf( '$' );
      output += "\n\n\"def\" is located at index " +
                letters.indexOf( "def" );
      output += "\n\"def\" is located at index " +
                letters.indexOf( "def", 7 );
      output += "\n\"hello\" is located at index " +
                letters.indexOf( "hello" );
      output += "\n\nLast \"def\" is located at index " +
                letters.lastIndexOf( "def" );
      output += "\nLast \"def\" is located at index " +
                letters.lastIndexOf( "def", 25 );
      output += "\nLast \"hello\" is located at index " +
                letters.lastIndexOf( "hello" );
      JOptionPane.showMessageDialog( null, output,
         "Demonstrating String Class \"index\" Methods",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
