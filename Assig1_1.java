import java.lang.*;
import java.io.*;

class Addition
{
    public int AddNums(int iValue1,int iValue2)
    {
        return iValue1 + iValue2;
    }
}
class Assig1_1
{
    public static void main(String a[])throws IOException
    { 
        
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        
        System.out.println("Enter the first number:");
        int iNo1=Integer.parseInt(bobj.readLine());
        
        System.out.println("Enter the second number:");
        int iNo2=Integer.parseInt(bobj.readLine());
        
        Addition aobj = new Addition();
        int iRet=aobj.AddNums(iNo1,iNo2);
        
        System.out.println("Addition is:"+iRet);
    }
}
