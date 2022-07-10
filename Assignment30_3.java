//check whether 7th 15th 21th 28th bit is on or off

import java.lang.*;
import java.util.*;

class Bitwise
{
    public boolean CheckBit(int iNo)
    {
        int iResult = 0;
        int iMask = 0X08104040;
        
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
class Assignment30_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int Value = sobj.nextInt();
        
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
