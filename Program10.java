//Accept Number from user and 

import java.lang.*;
import java.util.*;

class Bitwise
{
     public int ToggleBit(int iNo,int iPos)
     {
         if((iPos <= 0) || (iPos > 32))
         {
             System.out.println("Invalide Position");
             return 0;
         }
         int iMask = 0X00000001;
         
         int iResult = 0;
         
         iMask = iMask<<(iPos-1);
         
         iResult = iNo ^ iMask;
         
         return iResult;
     }
}

class Program10
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number");
        int value = sobj.nextInt();
        
        System.out.println("Enter position");
        int Pos = sobj.nextInt();
        
        Bitwise bobj = new Bitwise();
        
        int iRet = bobj.ToggleBit(value,Pos);
        System.out.println("Updated number is: "+iRet);
        
        
    }

}
