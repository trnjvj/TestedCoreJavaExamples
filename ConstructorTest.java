import java.util.*;

public class ConstructorTest
{
   public static void main(String[] args)
   {     
      Employee[] staff = new Employee[3];
      staff[0] = new Employee("Harry", 40000);
      staff[1] = new Employee(60000);
      staff[2] = new Employee();
      for (int i = 0; i < staff.length; i++)
      {
         Employee e = staff[i];
         System.out.println("name=" + e.getName()
            + ",id=" + e.getId()
            + ",salary=" + e.getSalary());
      }
   }
}
class Employee
{ 
   public Employee(String n, double s)
   {
      name = n;
      salary = s;
   }
   public Employee(double s)
   { 
      this("Employee #" + nextId, s);
   }
   public Employee()
   {
  
   }
   public String getName()
   {
      return name;
   }
   public double getSalary()
   {
      return salary;
   }
   public int getId()
   {
      return id;
   }
   private String name = ""; 
   private double salary;
   private int id;
   private static int nextId;
   {
      id = nextId;
      nextId++;
   }
   static
   {
      Random generator = new Random();
      nextId = generator.nextInt(10000);
   }
}
