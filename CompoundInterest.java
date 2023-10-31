import java.text.*;
import javax.swing.*;

public class CompoundInterest
{
   public static void main(String[] args)
   {
      final int STARTRATE = 10;
      final int NRATES = 6;
      final int NYEARS = 10;
      double[] interestRate = new double[NRATES];
      for (int j = 0; j < interestRate.length; j++)
         interestRate[j] = (STARTRATE + j) / 100.0;
      double[][] balance = new double[NYEARS][NRATES];
      for (int j = 0; j < balance[0].length; j++)
         balance[0][j] = 10000;
      for (int i = 1; i < balance.length; i++)
      {
         for (int j = 0; j < balance[i].length; j++)
         {
            double oldBalance = balance[i - 1][j];
            double interest = oldBalance * interestRate[j];
            balance[i][j] = oldBalance + interest;
         }
      }
      NumberFormat formatter = NumberFormat.getPercentInstance();
      for (int j = 0; j < interestRate.length; j++)
      {
         System.out.print("        ");
         System.out.print(formatter.format(interestRate[j]));
      }
      System.out.println();
      formatter = NumberFormat.getCurrencyInstance();
      for (int i = 0; i < balance.length; i++)
      {
         for (int j = 0; j < balance[i].length; j++)
         {
            System.out.print(" ");
            System.out.print(formatter.format(balance[i][j]));
         }
         System.out.println();
      }
   }
}
