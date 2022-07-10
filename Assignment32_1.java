// Accept one number from user and check whether bit at that position is on or off if bit is 1 return true otherwise return false.

import java.lang.*;
import java.util.*;

class Bitwise
{
    public boolean ChkBit(int iNo,int iPos)
    {
        int iResult = 0;
        int iMask = 0X00000001;
        
        iMask = iMask<<(iPos-1);
        
        iResult = iNo & iMask;
        
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

class Assignment32_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int Value = sobj.nextInt();
        
        System.out.println("Enter the position:");
        int pos = sobj.nextInt();
        
        Bitwise bobj = new Bitwise();
        boolean bRet=bobj.ChkBit(Value,pos);
        
        if(bRet == true)
        {
            System.out.println("Bit is On");
        }
        else
        {
            System.out.println("Bit is Off");
        }
    }
 
}
