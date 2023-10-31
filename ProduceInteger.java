import javax.swing.JTextArea;

public class ProduceInteger extends Thread {
   private HoldIntegerSynchronized pHold;
   private JTextArea output;
   public ProduceInteger( HoldIntegerSynchronized h,
                          JTextArea o )
   {
      super( "ProduceInteger" );
      pHold = h;
      output = o;
   }
   public void run()
   {
      for ( int count = 1; count <= 10; count++ ) {
         try {
            Thread.sleep( (int) ( Math.random() * 500 ) );
         }
         catch( InterruptedException e ) {
            System.err.println( e.toString() );
         }
         pHold.setSharedInt( count );
      }
      output.append( "\n" + getName() +
         " finished producing values" +
         "\nTerminating " + getName() + "\n" );
   }
}
