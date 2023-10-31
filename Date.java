public class Date extends Object {
   private int month;
   private int day; 
   private int year; 
   public Date( int mn, int dy, int yr )
   {
      if ( mn > 0 && mn <= 12 )    
         month = mn;
      else {
         month = 1;
         System.out.println( "Month " + mn + 
                             " invalid. Set to month 1." );
      }
      year = yr;                     
      day = checkDay( dy );         

      System.out.println(
         "Date object constructor for date " + toString() );
   }
   private int checkDay( int testDay )
   {
      int daysPerMonth[] = { 0, 31, 28, 31, 30,
                             31, 30, 31, 31, 30,
                             31, 30, 31 };
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;
      if ( month == 2 &&   // February: Check for leap year
           testDay == 29 &&
           ( year % 400 == 0 ||
             ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;
      System.out.println( "Day " + testDay + 
                          " invalid. Set to day 1." );
      return 1;  
   }
   public String toString()
      { return month + "/" + day + "/" + year; }
}
