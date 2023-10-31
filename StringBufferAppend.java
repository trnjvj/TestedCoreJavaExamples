import javax.swing.*;

public class StringBufferAppend {
   public static void main( String args[] )
   {
      Object o = "hello"; 
      String s = "good bye";  
      char charArray[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean b = true;
      char c = 'Z';
      int i = 7;
      long l = 10000000;
      float f = 2.5f;
      double d = 33.333;
      StringBuffer buf = new StringBuffer();
      buf.append( o );
      buf.append( "  " );
      buf.append( s );
      buf.append( "  " );
      buf.append( charArray );
      buf.append( "  " );
      buf.append( charArray, 0, 3 );
      buf.append( "  " );
      buf.append( b );
      buf.append( "  " );
      buf.append( c );
      buf.append( "  " );
      buf.append( i );
      buf.append( "  " );
      buf.append( l );
      buf.append( "  " );
      buf.append( f );
      buf.append( "  " );
      buf.append( d );
      JOptionPane.showMessageDialog( null,
         "buf = " + buf.toString(),
         "Demonstrating StringBuffer append Methods",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
