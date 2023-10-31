import java.awt.*;

public class TileTest
{  public static void main(String[] args)
   {  Tile[] a = new Tile[20];
      int i;
      for (i = 0; i < a.length; i++) 
         a[i] = new Tile(i, i, 10, 20, 
            (int)(100 * Math.random()));       
      Sort.shell_sort(a);
      for (i = 0; i < a.length; i++) 
         System.out.println(a[i]);
   }
}
interface Sortable 
{  public int compare(Sortable b);
}
class Sort
{  public static void shell_sort(Sortable[] a)
   {  int n = a.length;
      int incr = n / 2;
      while (incr >= 1)
      {  for (int i = incr; i < n; i++)
         {  Sortable temp = a[i];
            int j = i;
            while (j >= incr 
               && temp.compare(a[j - incr]) < 0)
            {  a[j] = a[j - incr];
               j -= incr;
            }
            a[j] = temp;
         }
         incr /= 2;
      }
   }
}
class Tile extends Rectangle implements Sortable
{  public Tile(int x, int y, int w, int h, int zz)
   {  super(x, y, w, h);
      z = zz;
   }
   public int compare(Sortable b)
   {  Tile tb = (Tile)b;
      return z - tb.z;
   }
   public String toString()
   {  return super.toString() + "[z=" + z + "]";
   }
   private int z;
}


