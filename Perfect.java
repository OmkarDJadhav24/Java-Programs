import java.io.*;

class Factors
{
    public int FindFactors(int iNo)
    {
       int iCnt = 0;
       int iSum = 0;
       for(iCnt=1;iCnt<=(iNo/2);iCnt++)
       {
          if((iNo%iCnt)==0)
          {
              iSum = iSum + iCnt;
          }
       }
       return iSum;
    }
}
class PerfectX
{
    public boolean CheckPerfect(int iNo)
    {
       Factors fobj = new Factors();
       int iRet=fobj.FindFactors(iNo);
       
       if(iRet==iNo)
       {
          return true;
       }
       else
       {
          return false;
       }
    }
}
class Perfect
{
    public static void main(String a[])throws IOException
    {
       InputStreamReader iobj = new InputStreamReader(System.in);
       BufferedReader bobj = new BufferedReader(iobj);
       
       System.out.println("Enter the number:");
       int iValue=Integer.parseInt(bobj.readLine());
       
       PerfectX pobj = new PerfectX();
       boolean bRet=pobj.CheckPerfect(iValue);
       
       if(bRet==true)
       {
           System.out.println("This is a perfect number");
       }
       else
       {
           System.out.println("This is not a perfect number");
       }
    }
}
