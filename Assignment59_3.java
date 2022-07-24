// Write a java program which accept array of characters from user and count number of capital characters.

import java.lang.*;
import java.util.*;

class MyArray
{
    public char Arr[];
    public int iNo;
    
    public MyArray(int iSize)
    {
        iNo = iSize;
    }
    
    public void Accept()
    {
        Arr = new char[iNo];
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the characters:");
        Arr =  sobj.next().toCharArray();
      
    }
    
    public int DisplayCap()
    {
        int i=0,iCnt = 0;
        
        for(i=0;i<Arr.length;i++)
        {
            if((Arr[i]>='A') & (Arr[i]<='Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Assignment59_3
{
    public static void main(String arg[])
    {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter the size of array");
         int iSize = obj.nextInt();
         
         MyArray mobj = new MyArray(iSize);
         mobj.Accept();
         int iRet = mobj.DisplayCap();
         System.out.println("Count of capital characters is: "+iRet);
    }
}
