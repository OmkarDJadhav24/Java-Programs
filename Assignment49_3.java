import java.io.*;
import java.util.*;

class Digit
{
    public int CountRange()
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
            if((iDigit>=3) && (iDigit<=7))
            {
                iCnt++;
            }
            iNo = iNo/10;
        }
        return iCnt;
    }
}
class Assignment49_3
{
    public static void main(String arg[])
    {
        Digit obj = new Digit();
        int iRet = obj.CountRange();
        System.out.println("Count of digits between 3 and 7 is: "+iRet);
    }
}
