import java.lang.*;

class Employee   //class Employee extends Object
{
    public static void main(String arg[])
    {
       public String name;
       public int Salary;
    }
    
    public Employee(String str,int no)
    {
       this.name=str;
       this.Salary=no;
    }
    
    public String to String()
    {
       return name+"->"+Salary;
    }
}

class Object1
{
   public static void main(String arg[])
   {
      Employee eobj = new Employee("Piyush",11000);
      System.out.println(eobj.toString());
   }
}
