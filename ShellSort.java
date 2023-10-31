public class ShellSort
{  public static void sort(int[] a)
   {  int n = a.length;
      int incr = n / 2;
      while (incr >= 1)
      {  for (int i = incr; i < n; i++)
         {  int temp = a[i];
            int j = i;
            while (j >= incr && temp < a[j - incr])
            {  a[j] = a[j - incr];
               j -= incr;
            }
            a[j] = temp;
         }
         incr /= 2;
      }
   }   
   public static void main(String[] args)
   {  
      int[] a = new int[10];
      int i;      
      for (i = 0; i < a.length; i++)
         a[i] = (int)(Math.random() * 100);       
      sort(a);      
      for (i = 0; i < a.length; i++)
         System.out.println(a[i]);
   }
}
