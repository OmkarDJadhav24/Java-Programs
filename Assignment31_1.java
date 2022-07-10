// Accept one number from user and off 7th bit of that number if it is on and return modified number. 

import java.lang.*;
import java.util.*;

class Bitwise
{
    public int OffBit(int iNo)
    {
        int iResult = 0;
        int iMask = 0X00000040;
        
        iResult = iNo ^ iMask;
        
        return iResult;
    }
}

class Assignment31_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int Value = sobj.nextInt();
        
        Bitwise bobj = new Bitwise();
        
        int iRet = bobj.OffBit(Value);
        System.out.println("Updated Bit is: "+iRet);
        
    }
}
