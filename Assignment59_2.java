// Write a java program which accept array from user and replace each member with summation of its digits.

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
    
    public void Display()
    {
        System.out.println("Elements of array are:");
        for(int i=0;i<Arr.length;i++)
        {
             System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
    
    public void SumArray()
    {
        int iNo = 0;
        int iDigit = 0;
        int iSum = 0;
        for(int i=0;i<Arr.length;i++)
        {
            iNo = Arr[i];
            while(iNo>0)
            {
                iDigit = iNo%10;
                iSum = iSum + iDigit;
                iNo = iNo/10;
            }
            Arr[i] = iSum;
            iSum = 0;
        }
    }
}

class Assignment59_2
{
    public static void main(String arg[])
    {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter the size of array:");
         int iSize = obj.nextInt();
         
         MyArray mobj = new MyArray(iSize);
         mobj.Accept();
         mobj.Display();
         mobj.SumArray();
         mobj.Display();
    }

}
