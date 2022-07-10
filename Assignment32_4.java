// Accept one number from user and position from user and toggle that bit return modified number.

import java.lang.*;
import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo,int iPos)
    {
         int iResult = 0;
         int iMask = 0X00000001;
         
         iMask = iMask<<(iPos-1);
         
         iResult = iNo ^ iMask;
         return iResult;
    }
}

class Assignment32_4
{
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the number:");
         int Value = sobj.nextInt();
         
         System.out.println("Enter the position:");
         int pos = sobj.nextInt();
         
         Bitwise bobj = new Bitwise();
         int iRet = bobj.ToggleBit(Value,pos);
         
         System.out.println("Modified Bit is: "+iRet);
    }
}
