public final class CommissionWorker extends Employee {
   private double salary;      
   private double commission;  
   private int quantity;       

   public CommissionWorker( String first, String last,
                            double s, double c, int q)
   {
      super( first, last );  
      setSalary( s );
      setCommission( c );
      setQuantity( q );
   }
   public void setSalary( double s )
      { salary = ( s > 0 ? s : 0 ); }
   public void setCommission( double c ) 
      { commission = ( c > 0 ? c : 0 ); }
   public void setQuantity( int q )
      { quantity = ( q > 0 ? q : 0 ); }
   public double earnings()
      { return salary + commission * quantity; }
   public String toString() 
   {
      return "Commission worker: " + super.toString();
   }
}
