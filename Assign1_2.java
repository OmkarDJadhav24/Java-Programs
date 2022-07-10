import java.lang.*;
import java.io.*;

class Reverse
{
   public void ReverseNumbers(int iNo)
   {
       int iCnt = 0;
       for(iCnt=iNo;iCnt>0;iCnt--)
       {
           System.out.println(iCnt);
       }
   }
}
class Assign1_2
{
   public static void main(String a[]) throws IOException
   {  
       int iNo=0;
       InputStreamReader iobj = new InputStreamReader(System.in);
       BufferedReader bobj = new BufferedReader(iobj);
       
       System.out.println("Enter the number:");
       iNo=Integer.parseInt(bobj.readLine());
       
       Reverse robj = new Reverse();
       robj.ReverseNumbers(iNo);
   }
   
}
