public class Welcome
{
   public static void main(String[] args)
   {
      String[] greeting = new String[3];
      greeting[0] = "Welcome";
      greeting[1] = "to the ";
      greeting[2] = "neighborhood!";
      for (int i = 0; i < greeting.length; i++)
         System.out.println(greeting[i]);
   }
}



