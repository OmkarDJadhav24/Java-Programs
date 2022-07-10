//Accept Number from user and check bit is on or off

import java.lang.*;
import java.util.*;

class Bitwise
{
     public boolean CheckBit(int iNo)
     {
        int iResult = 0;
        int iMask = 1048576;
        
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

class Program4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number");
        int value = sobj.nextInt();
        
        Bitwise bobj = new Bitwise();
        boolean bret = bobj.CheckBit(value);
        
        if(bret == true)
        {
            System.out.println("Bit is on");
        }
        else
        {
            System.out.println("Bit is off");
        }
    }

}
