import javax.swing.*;

public class Retirement
{
   public static void main(String[] args)
   {
      String input = JOptionPane.showInputDialog
         ("How much money do you need to retire?");
      double goal = Double.parseDouble(input);
      input = JOptionPane.showInputDialog
         ("How much money will you contribute every year?");
      double payment =  Double.parseDouble(input);
      input = JOptionPane.showInputDialog
         ("Interest rate in %:");
      double interestRate =  Double.parseDouble(input);
      double balance = 0;
      int years = 0;
      while (balance < goal)
      {
         balance += payment;
         double interest = balance * interestRate / 100;
         balance += interest;
         years++;
      }
      System.out.println
         ("Your can retire in " + years + " years.");
      System.exit(0);
   }
}
