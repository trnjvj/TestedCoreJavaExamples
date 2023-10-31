import java.text.*;

public class PersonTest
{  
   public static void main(String[] args)
   {  
      Person[] people = new Person[2];
      people[0] 
         = new Employee("Henry Huggins", 50000);
      people[1] 
         = new Student("Mary McBride", "computer science");
      for (int i = 0; i < people.length; i++)
      {  
         Person p = people[i];
         System.out.println(p.getName() + ", "
            + p.getDescription());
      }
   }
}
abstract class Person
{  
   public Person(String n)
   {  
      name = n;
   }
   public abstract String getDescription();
   public String getName()
   {  
      return name;
   }
   private String name;
}
class Employee extends Person
{  
   public Employee(String n, double s)
   {  
      super(n);
      salary = s;
   }
   public double getSalary()
   {  
      return salary;
   }
   public String getDescription()
   {  
      NumberFormat formatter
         = NumberFormat.getCurrencyInstance();
      return "an employee with a salary of "
         + formatter.format(salary);
   }
   public void raiseSalary(double byPercent)
   {  
      double raise = salary * byPercent / 100;
      salary += raise;
   }
   private double salary;
}
class Student extends Person
{  
   public Student(String n, String m)
   {  
      super(n);
      major = m;
   }
   public String getDescription()
   {  
      return "a student majoring in " + major;
   }
   private String major;
}
