import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class AnonymousInnerClassTest
{  
   public static void main(String[] args)
   {  
      BankAccount account = new BankAccount(10000);
      account.start(10);
      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}
class BankAccount
{  
   public BankAccount(double initialBalance)
   {  
      balance = initialBalance;
   }
   public void start(final double rate)
   {
      ActionListener adder = new
         ActionListener()
         {  
            public void actionPerformed(ActionEvent event)
            {  
               // update interest
               double interest = balance * rate / 100;
               balance += interest;

               // print out current balance
               NumberFormat formatter 
                  = NumberFormat.getCurrencyInstance();
               System.out.println("balance=" 
                  + formatter.format(balance));
            }
         };    
      Timer t = new Timer(1000, adder);
      t.start();
   }
   private double balance;
}
