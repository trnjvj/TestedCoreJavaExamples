public class HoldIntegerUnsynchronized {
   private int sharedInt = -1;
   public void setSharedInt( int val )
   {
      System.err.println( Thread.currentThread().getName() +
         " setting sharedInt to " + val );
      sharedInt = val;
   }
   public int getSharedInt()
   {
      System.err.println( Thread.currentThread().getName() +
         " retrieving sharedInt value " + sharedInt );
      return sharedInt;
   }
}
