//check whether 5th 18th bit is on or off

import java.lang.*;
import java.util.*;

class Bitwise
{
    public boolean Bitcheck(int iNo)
    {
        int iResult = 0;
        int iMask = 0X00020010;
        
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

class Assignment29_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int Value = sobj.nextInt();
        
        Bitwise bobj = new Bitwise();
        boolean bRet=bobj.Bitcheck(Value);
        
        if(bRet==true)
        {
            System.out.println("Bit is On");
        }
        else
        {
            System.out.println("Bit is Off");
        }
    }

}
