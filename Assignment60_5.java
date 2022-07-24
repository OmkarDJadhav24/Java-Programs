// Write a java program which accept array from user and display below pattern.

import java.lang.*;
import java.util.*;

class MyArray
{
    public int Arr[];
    public int iNo;
    
    public MyArray(int iSize)
    {
        iNo = iSize;
    }
    
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        
        Arr = new int[iNo];
        
        System.out.println("Enter the elements:");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }
    
    public void Pattern()
    {
        int i=0,j=0;
        for(i=0;i<Arr.length;i++)
        {
            if((Arr[i]%2)==0)
            {
                for(j=0;j<Arr[i];j++)
                {
                   System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }
}

class Assignment60_5
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int iSize = obj.nextInt();
        
        MyArray mobj = new MyArray(iSize);
        mobj.Accept();
        mobj.Pattern();
        
    }
    
}
