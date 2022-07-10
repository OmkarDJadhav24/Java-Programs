// Accept one number from user and and on its first 4 bits and return modified number

import java.lang.*;
import java.util.*;

class Bitwise
{
    public int OnBit(int iNo)
    {
         int iResult = 0;
         int iMask = 0X0000000F;
         
         iResult = iNo | iMask;
         return iResult;
    }
}

class Assignment31_5
{
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter the number:");
         int Value = sobj.nextInt();
         
         Bitwise bobj = new Bitwise();
         int iRet = bobj.OnBit(Value);
         System.out.println("Modified Number is : "+iRet);
         
    }

}
