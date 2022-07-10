import java.io.*;
import java.util.*;

class Digit
{
    public int CountOdd()
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
            if((iDigit%2)!=0)
            {
                iCnt++;
            }
            iNo = iNo/10;
        }
        return iCnt;
    }
}
class Assignment49_2
{
    public static void main(String arg[])
    {
        Digit obj = new Digit();
        int iRet = obj.CountOdd();
        System.out.println("Count of Odd digits is: "+iRet);
    }
}
