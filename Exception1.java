import java.lang.*;
import java.util.*;

class AgeInvalide extends Exception
{
    public AgeInvalide(String str)
    {
        super(str);
    }
}
class Exception1
{
    public static void main(String a[])
    {   
        int age=0;
        Scanner sobj = new Scanner(System.in);
        age=sobj.nextInt();
        
        try
        {
           if(age<18)
           {
              throw new AgeInvalide("Age is Invalide");
           }
        }
        catch(AgeInvalide obj)
        {
           System.out.println("Inside Catch");
           System.out.println(obj);
        }
    }
    
}
