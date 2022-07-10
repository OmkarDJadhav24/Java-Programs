import java.io.*;
import java.util.*;

class Digit
{
    public int CountDiff()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();
        
        int iDigit = 0;
        int iESum = 0;
        int iOSum = 0;
        
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iNo>0)
        {
            iDigit = iNo%10;
            if((iDigit%2)==0)
            {
                iESum = iESum + iDigit;
            }
            else
            {
                iOSum = iOSum + iDigit;
            }
            iNo = iNo/10;
        }
        return iESum - iOSum;
    }
}
class Assignment49_5
{
    public static void main(String arg[])
    {
        Digit obj = new Digit();
        int iRet = obj.CountDiff();
        System.out.println("Difference between summation of even numbers and summation of odd number : "+iRet);
    }
}
