public class Assertion
{
   public static void check(boolean b, String s)
   {
      if (!ndebug && !b)
      {
         System.err.print("Assertion failed. ");
         if (s != null) System.err.print(s);
         System.err.println();
         Thread.dumpStack();
         System.exit(1);
      }
   }
   public static void check(boolean b)
   {
      check(b, null);
   }
   public static void check(Object obj, String s)
   {
      check (obj != null, s);
   }
   public static void check(Object obj)
   {
      check (obj != null, null);
   }
   public static void check(double x, String s)
   {
      check (x != 0, s);
   }
   public static void check(double x)
   {
      check (x != 0, null);
   }
   public static void check(long x, String s)
   {
      check (x != 0, s);
   }
   public static void check(long x)
   {
      check (x != 0, null);
   }
   public static void setNdebug(boolean b)
   {
      ndebug = b;
   }
   private static boolean ndebug = false;
   public static void main(String[] args)
   {
      Assertion.check(args);
      Assertion.check(args.length, "No command line arguments");
   }
}
