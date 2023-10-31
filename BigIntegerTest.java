import javax.swing.*;
import java.math.*;

public class BigIntegerTest
{  
   public static void main(String[] args)
   {  
      String input = JOptionPane.showInputDialog
         ("How many numbers do you need to draw?");
      int k = Integer.parseInt(input);
      input = JOptionPane.showInputDialog
         ("What is the highest number you can draw?");
      int n = Integer.parseInt(input);
      BigInteger lotteryOdds = BigInteger.valueOf(1);
      for (int i = 1; i <= k; i++)
         lotteryOdds = lotteryOdds
            .multiply(BigInteger.valueOf(n - i + 1))
            .divide(BigInteger.valueOf(i));
      System.out.println("Your odds are 1 in " + lotteryOdds +
        ". Good luck!");
      System.exit(0);
   }
}
