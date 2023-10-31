import javax.swing.JTextArea;

public class ConsumeInteger extends Thread {
   private HoldIntegerSynchronized cHold;
   private JTextArea output;

   public ConsumeInteger( HoldIntegerSynchronized h,
                          JTextArea o )
   {
      super( "ConsumeInteger" );
      cHold = h;
      output = o;
   }
   public void run()
   {
      int val, sum = 0;
      do {
         try {
            Thread.sleep( (int) ( Math.random() * 3000 ) );
         }
         catch( InterruptedException e ) {
            System.err.println( e.toString() );
         }
         val = cHold.getSharedInt();
         sum += val;
      } while ( val != 10 );
      output.append( "\n" + getName() +
         " retrieved values totaling: " + sum +
         "\nTerminating " + getName() + "\n" );
   }
}
