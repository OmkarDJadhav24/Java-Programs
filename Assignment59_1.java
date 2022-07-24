// Write a java program which accept array from user and reverse each number of that array.

import java.lang.*;
import java.util.*;

class MyArray
{
    public int Arr[];
    public int Brr[];
    public int iNo;
    public MyArray(int iSize)
    {
        iNo = iSize;
    }
    
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        Arr = new int[iNo];
        Brr = new int[iNo];
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }
    
    public void Display()
    {
        System.out.println("Elements of array:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
        
        System.out.println("Elements of array after reverse:");
        for(int j=0;j<Brr.length;j++)
        {
            System.out.print(Brr[j]+" ");
        }
        System.out.println();
    }
    
    public void ReverseArray()
    {
        int j = 0;
        int iNo = 0;
        int iDigit = 0;
        int iRev = 0;
        for(int i=0;i<Arr.length;i++)
        {
            iNo = Arr[i];
            while(iNo>0)
            {
                iDigit = iNo%10;
                iRev = iRev*10 + iDigit;
                iNo = iNo/10;
            }
            Brr[j] = iRev;
            iRev = 0;
            j++;
        }
    }
}

class Assignment59_1
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int iNo = obj.nextInt();
        
        MyArray mobj = new MyArray(iNo);
        mobj.Accept();
        mobj.ReverseArray();
        mobj.Display();
    }

}
