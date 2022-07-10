import java.io.*;
import java.util.*;

class Digit
{
    public int Multiply()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();
        
        int iDigit = 0;
        int iMult = 1;
        
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iNo>0)
        {
            iDigit = iNo%10;
            if(iDigit>0)
            {
                iMult = iMult * iDigit;
            }
            iNo = iNo/10;
        }
        return iMult;
    }
}
class Assignment49_4
{
    public static void main(String arg[])
    {
        Digit obj = new Digit();
        int iRet = obj.Multiply();
        System.out.println("Multiplication of digits is : "+iRet);
    }
}
