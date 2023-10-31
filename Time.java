import java.text.DecimalFormat;
public class Time extends Object {
   private int hour;  
   private int minute; 
   private int second;
   public Time() { setTime( 0, 0, 0 ); }
   public void setTime( int h, int m, int s )
   {
      setHour( h );  
      setMinute( m );
      setSecond( s );
   }
   public void setHour( int h ) 
      { hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); }
   public void setMinute( int m ) 
      { minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); }
   public void setSecond( int s ) 
      { second = ( ( s >= 0 && s < 60 ) ? s : 0 ); }
   public int getHour() { return hour; }
   public int getMinute() { return minute; }
   public int getSecond() { return second; }
   public String toString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );
      return ( ( getHour() == 12 || getHour() == 0 ) ? 
               12 : getHour() % 12 ) + ":" +
             twoDigits.format( getMinute() ) + ":" +
             twoDigits.format( getSecond() ) +
             ( getHour() < 12 ? " AM" : " PM" );
   }
}
