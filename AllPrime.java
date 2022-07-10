import java.io.*;
import java.lang.*;
import java.util.*;

class CheckPrimeA
{
    public boolean CheckPrimeX(int iNo)
    {
        int iCnt=0;
        int iFactCnt=0;
        
        for(iCnt=2;iCnt<=(iNo/2);iCnt++)
        {
            if((iNo%iCnt)==0)
            {
               iFactCnt++;
               break;
            }
        }
        
        if(iCnt>(iNo/2))
        {
           return true;
        }
        else
        {
           return false;
        }
    }
}
class AllPrime
{
    public static void main(String a[])throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader obj = new BufferedReader(iobj);
        
        System.out.println("Enter the number:");
        int iValue=Integer.parseInt(obj.readLine());
        
        CheckPrimeA cobj = new CheckPrimeA();
        
        boolean bRet=cobj.CheckPrimeX(iValue);
        
        if(bRet==true)
        {
           System.out.println("This is a prime number");
        }
        else
        {
           System.out.println("This is not a prime number");
        }
    }
  
}
