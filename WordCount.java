import java.io.*;
import java.util.*;

public class WordCount
{
   public static void main(String[] args)
   {
      String input = "";
      int lines = 0;
      try
      {
         BufferedReader reader = new BufferedReader(new
            InputStreamReader(System.in));
         String line;
         while ((line = reader.readLine()) != null)
         {
            line += "\n"; 
            input += line; 
            lines++;
         }
      }
      catch (IOException exception) 
      {
         exception.printStackTrace();
      }
      StringTokenizer tokenizer = new StringTokenizer(input);
      int words = tokenizer.countTokens();
      System.out.println(lines + " " + words 
         + " " + input.length());
   }
}
