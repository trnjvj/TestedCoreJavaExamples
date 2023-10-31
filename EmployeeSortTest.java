import java.util.*;

public class EmployeeSortTest
{  
   public static void main(String[] args)
   {  
      Employee[] staff = new Employee[3];
      staff[0] = new Employee("Harry Hacker", 35000);
      staff[1] = new Employee("Carl Cracker", 75000);
      staff[2] = new Employee("Tony Tester", 38000);
      Arrays.sort(staff);
      for (int i = 0; i < staff.length; i++)
      {  
         Employee e = staff[i];
         System.out.println("name=" + e.getName()
            + ",salary=" + e.getSalary());
      }
   }
}
class Employee implements Comparable
{  
   public Employee(String n, double s)
   {  
      name = n;
      salary = s;
   }
   public String getName()
   {  
      return name;
   }
   public double getSalary()
   {  
      return salary;
   }
   public void raiseSalary(double byPercent)
   {  
      double raise = salary * byPercent / 100;
      salary += raise;
   }
   public int compareTo(Object otherObject)
   {  
      Employee other = (Employee)otherObject;
      if (salary < other.salary) return -1;
      if (salary > other.salary) return 1;
      return 0;
   }
   private String name;
   private double salary;
}
