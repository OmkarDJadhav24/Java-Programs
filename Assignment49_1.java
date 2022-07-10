import java.io.*;
import java.util.*;

class Digit
{
    public int CountEven()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();
        
        int iDigit = 0;
        int iCnt = 0;
        
        if(iNo<0)
        {
            iNo = -iNo;
        }
        
        while(iNo>0)
        {
            iDigit = iNo%10;
            if((iDigit%2)==0)
            {
                iCnt++;
            }
            iNo = iNo/10;
        }
        return iCnt;
    }
}
class Assignment49_1
{
    public static void main(String arg[])
    {
        Digit obj = new Digit();
        int iRet = obj.CountEven();
        System.out.println("Count of Even digits is: "+iRet);
    }
}
