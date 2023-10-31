import javax.swing.*;

public class StringBufferInsert {
   public static void main( String args[] )
   {
      Object o = "hello";  
      String s = "good bye";  
      char charArray[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean b = true;
      char c = 'K';
      int i = 7;
      long l = 10000000;
      float f = 2.5f;
      double d = 33.333;
      StringBuffer buf = new StringBuffer();
      buf.insert( 0, o );
      buf.insert( 0, "  " );
      buf.insert( 0, s );
      buf.insert( 0, "  " );
      buf.insert( 0, charArray );
      buf.insert( 0, "  " );
      buf.insert( 0, b );
      buf.insert( 0, "  " );
      buf.insert( 0, c );
      buf.insert( 0, "  " );
      buf.insert( 0, i );
      buf.insert( 0, "  " );
      buf.insert( 0, l );
      buf.insert( 0, "  " );
      buf.insert( 0, f );
      buf.insert( 0, "  " );
      buf.insert( 0, d );
      String output = "buf after inserts:\n" + buf.toString();
      buf.deleteCharAt( 10 );     
      buf.delete( 2, 6 );         
      output += "\n\nbuf after deletes:\n" + buf.toString();
      JOptionPane.showMessageDialog( null, output,
         "Demonstrating StringBufferer Inserts and Deletes",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}
