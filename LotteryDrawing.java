
import java.util.*;
import javax.swing.*;

public class LotteryDrawing
{  
   public static void main(String[] args)
   {  
      String input = JOptionPane.showInputDialog
         ("How many numbers do you need to draw?");
      int k = Integer.parseInt(input);

      input = JOptionPane.showInputDialog
         ("What is the highest number you can draw?");
      int n = Integer.parseInt(input);


      int[] numbers = new int[n];
      for (int i = 0; i < numbers.length; i++)
         numbers[i] = i + 1;



      int[] result = new int[k];
      for (int i = 0; i < result.length; i++)
      {  

         int r = (int)(Math.random() * n);


         result[i] = numbers[r];


         numbers[r] = numbers[n - 1];
         n--;
      }



      Arrays.sort(result);
      System.out.println
         ("Bet the following combination. It'll make you rich!");
      for (int i = 0; i < result.length; i++)
         System.out.println(result[i]);

      System.exit(0);
   }
}
