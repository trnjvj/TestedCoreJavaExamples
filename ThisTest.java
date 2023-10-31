import javax.swing.*;
import java.text.DecimalFormat;

public class ThisTest {
   public static void main( String args[] )
   {
      SimpleTime t = new SimpleTime( 12, 30, 19 );
      JOptionPane.showMessageDialog( null, t.buildString(),
         "Demonstrating the \"this\" Reference",
         JOptionPane.INFORMATION_MESSAGE );
      System.exit( 0 );
   }
}

class SimpleTime {
   private int hour, minute, second;   
   public SimpleTime( int hour, int minute, int second )
   {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }
   public String buildString()
   {
      return "this.toString(): " + this.toString() +
             "\ntoString(): " + toString() +
             "\nthis (with implicit toString() call): " +
             this;
   }
   public String toString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );
      
      return twoDigits.format( this.hour ) + ":" +
             twoDigits.format( this.minute ) + ":" +
             twoDigits.format( this.second );
   }
}
