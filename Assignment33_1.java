// Accept one number from user and toggle the contents of first and last nibble of the number and return modified number.

import java.lang.*;
import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo)
    {
         int iResult = 0;
         int iMask = 0X00000001;
         int iPos = 1;
         int iCnt = 0;
         
         while(iPos<=32)
         {
             if(iPos==1)
             {
                iMask = 0X00000001;
                iMask = iMask<<(iPos-1);
                iResult = iNo & iMask;
                if(iPos == 1)
                {
                    iCnt++;
                }
             }
             iPos++;
         }
         return iCnt;
         
    }
}

class Assignment33_1
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
