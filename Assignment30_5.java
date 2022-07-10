//check whether first and last bit means 1st 32th bit is on or off

import java.lang.*;
import java.util.*;

class Bitwise
{
    public boolean CheckBit(long iNo)
    {
         long iResult = 0;
         long iMask = 0X80000001;
         
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

class Assignment30_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        long Value = sobj.nextLong();
        
        Bitwise bobj = new Bitwise();
        boolean bRet = bobj.CheckBit(Value);
        
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
