// Write a java program which accept two arrays and display minimum element of each array.

import java.lang.*;
import java.util.*;

class MyArray
{
    public int Arr[];
    public int Brr[];
    public int iNo1;
    public int iNo2;
    
    public MyArray(int iN1,int iN2)
    {
        this.iNo1 = iN1;
        this.iNo2 = iN2;
    }
    public void Accept()
    {
        Scanner obj = new Scanner(System.in);
        Arr = new int[iNo1];
        Brr = new int[iNo2];
        int i = 0;
        
        System.out.println("Enter the elements f array Arr:");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i] = obj.nextInt();
        }
        
        System.out.println("Enter the elements f array Brr:");
        for(i=0;i<Brr.length;i++)
        {
            Brr[i] = obj.nextInt();
        }
    }
    
    public void Display()
    {
        System.out.println("Elements of Array Arr are:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
        
        System.out.println("Elements of Array Brr are:");
        for(int i=0;i<Brr.length;i++)
        {
            System.out.println(Brr[i]);
        }
    }
    
    public void MinArray()
    {
        int iMinArr = Arr[0];
        int iMinBrr = Brr[0];
        int i = 0;
        
        for(i=0;i<Arr.length;i++)
        {
            if(iMinArr>Arr[i])
            {
                iMinArr = Arr[i];
            }
        }
        
        
        for(i=0;i<Brr.length;i++)
        {
            if(iMinBrr>Brr[i])
            {
                iMinBrr = Brr[i];
            }
        }
        System.out.println("Minimum of Arr:"+iMinArr);
        System.out.println("Minimum of Brr:"+iMinBrr);
        
    }
}


class Assignment58_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array Arr:");
        int iNo1 = sobj.nextInt();
        
        System.out.println("Enter the size of array Brr:");
        int iNo2 = sobj.nextInt();
        
        MyArray mobj = new MyArray(iNo1,iNo2);
        mobj.Accept();
        mobj.Display();
        mobj.MinArray();
        
    }
}
