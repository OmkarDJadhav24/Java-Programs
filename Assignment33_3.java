// Write a program which accept number from user and check whether 9th and 12th bit is on or off

import java.lang.*;
import java.util.*;

class Bitwise
{
    public boolean ChkBits(int iNo)
    {
        int iMask = 0X00000900;
        int iResult = 0;
        
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
class Assignment33_3
{
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the number: ");
         int Value = sobj.nextInt();
         
         Bitwise bobj = new Bitwise();
         boolean bRet=bobj.ChkBits(Value);
         
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
