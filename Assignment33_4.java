// Write a program which accept number and 2 positions from user and check whether bit at first or bit at second position is on or off.

import java.lang.*;
import java.util.*;

class Bitwise
{
    public boolean ChkBits(int iNo,int iPos1,int iPos2)
    {
        int iMask = 0XFFFFFFFF;
        int iResult = 0;
        
        iMask = iMask & iPos1;
        iMask = iMask & iPos2;
        
        iResult = iMask & iNo;
        
        if(iResult == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
class Assignment33_4
{
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the number: ");
         int Value = sobj.nextInt();
         
         System.out.println("Enter the first position: ");
         int iPos1 = sobj.nextInt();
         
         System.out.println("Enter the second position: ");
         int iPos2 = sobj.nextInt();
         
         Bitwise bobj = new Bitwise();
         boolean bRet=bobj.ChkBits(Value,iPos1,iPos2);
         
         if(bRet == true)
         {
             System.out.println("Bit is on");
         }
         else
         {
             System.out.println("Bit is off");
         }
    }
}
