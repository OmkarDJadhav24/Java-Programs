import java.lang.*;
import java.util.*;

class Demo
{
    public int Addition(int n1,int n2)throws ArithmeticException
    {
        return n1 / n2;
    }
}
class Exception2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int no1=0,no2=0,iRet=0;
        
        System.out.println("Enter the first number:");
        no1=sobj.nextInt();
        
        System.out.println("Enter the Second number:");
        no2=sobj.nextInt();
        
        Demo obj = new Demo();
        
        try
        {
           iRet=obj.Addition(no1,no2);
        }
        catch(ArithmeticException aobj)
        {
           System.out.println("Inside catch");
           System.out.println(aobj);
        }
    }

}
