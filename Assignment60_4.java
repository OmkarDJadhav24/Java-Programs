// Write a java program which accept array of characters from user and return difference between frequency of capital and small characters.

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
        Scanner sobj = new Scanner(System.in);
        Arr = new char[iNo];
        
        Arr = sobj.next().toCharArray();
    }
    
    public void Display()
    {
        System.out.println("Elements of array are: ");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
    
    public int Difference()
    {
        int iCapCnt = 0;
        int iSmallCnt = 0;
        int iDiff = 0;
        
        for(int i=0;i<Arr.length;i++)
        {
            if((Arr[i]>='A') & (Arr[i]<='Z'))
            {
                iCapCnt++;
            }
            else if((Arr[i]>='a') & (Arr[i]<='z'))
            {
                iSmallCnt++;
            }
        }
        iDiff = iSmallCnt - iCapCnt;
        return iDiff;
    }
    
}

class Assignment60_4
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int iSize = obj.nextInt();
        
        
        MyArray mobj = new MyArray(iSize);
        mobj.Accept();
        mobj.Display();
        int iRet = mobj.Difference();
        System.out.println("Difference between frequency of capital and small characters : "+iRet);
    }

}
