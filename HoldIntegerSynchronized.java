import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class HoldIntegerSynchronized {
   private int sharedInt[] = { -1, -1, -1, -1, -1 };
   private boolean writeable = true;
   private boolean readable = false;
   private int readLoc = 0, writeLoc = 0;
   private JTextArea output;
   public HoldIntegerSynchronized( JTextArea o )
   {
      output = o;
   }
   public synchronized void setSharedInt( int val )
   {
      while ( !writeable ) {
         try {
            output.append( " WAITING TO PRODUCE " + val );
            wait();
         }
         catch ( InterruptedException e ) {
            System.err.println( e.toString() );
         }
      }
      sharedInt[ writeLoc ] = val;
      readable = true;
      output.append( "\nProduced " + val +
                     " into cell " + writeLoc );
      writeLoc = ( writeLoc + 1 ) % 5;
      output.append( "\twrite " + writeLoc +
                     "\tread " + readLoc);
      displayBuffer( output, sharedInt );
      if ( writeLoc == readLoc ) {
         writeable = false;
         output.append( "\nBUFFER FULL" );
      }
      notify();
   }
   public synchronized int getSharedInt()
   {
      int val;
      while ( !readable ) {
         try {
            output.append( " WAITING TO CONSUME" );
            wait();
         }
         catch ( InterruptedException e ) {
            System.err.println( e.toString() );
         }
      }
      writeable = true;
      val = sharedInt[ readLoc ];
      output.append( "\nConsumed " + val +
                     " from cell " + readLoc );
      readLoc = ( readLoc + 1 ) % 5;
      output.append( "\twrite " + writeLoc +
                     "\tread " + readLoc );
      displayBuffer( output, sharedInt );
      if ( readLoc == writeLoc ) {
         readable = false;
         output.append( "\nBUFFER EMPTY" );
      }
      notify();
      return val;
   }
   public void displayBuffer( JTextArea out, int buf[] )
   {
      DecimalFormat formatNumber = new DecimalFormat( " #;-#" );
      output.append( "\tbuffer: " );
      for ( int i = 0; i < buf.length; i++ )
         out.append( " " + formatNumber.format( buf[ i ] ));
   }
}
