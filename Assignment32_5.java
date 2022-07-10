// Accept one number from user and toggle the contents of first and last nibble of the number and return modified number.

import java.lang.*;
import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo)
    {
         int iResult = 0;
         int iMask = 0X0000F00F;
         
         iResult = iNo ^ iMask;
         return iResult;
    }
}

class Assignment32_5
{
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the number:");
         int Value = sobj.nextInt();
         
         Bitwise bobj = new Bitwise();
         int iRet = bobj.ToggleBit(Value);
         
         System.out.println("Modified Bit is: "+iRet);
    }
}
