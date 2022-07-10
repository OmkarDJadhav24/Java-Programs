import java.lang.*;
import java.io.*;

class Divisible
{
    public boolean CheckDivisible(int iValue)
    {
        if((iValue%5)==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Assign1_3
{
    public static void main(String a[])throws IOException
    {
         InputStreamReader iobj = new InputStreamReader(System.in);
         BufferedReader bobj = new BufferedReader(iobj);
         
         System.out.println("Enter the number:");
         int iNo=Integer.parseInt(bobj.readLine());
         
         Divisible dobj = new Divisible();
         
         boolean bRet=dobj.CheckDivisible(iNo);
         
         if(bRet==true)
         {
             System.out.println("Divisible by 5");
         }
         else
         {
             System.out.println("Not divisible by 5");
         }
    }

}
