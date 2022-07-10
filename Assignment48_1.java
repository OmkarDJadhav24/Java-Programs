import java.io.*;
import java.util.*;

class ArrayDemo
{
    public int Difference()
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int iRange = sobj.nextInt();
        
        int Arr[] = new int[iRange];
        int i = 0;
        int iESum = 0;
        int iOSum = 0;
        
        System.out.println("Enter the elements:");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        for(i=0;i<Arr.length;i++)
        {
            if((Arr[i]%2)==0)
            {
                iESum = iESum + Arr[i];
            }
            else
            {
                iOSum = iOSum + Arr[i];
            }
        }
        return iESum - iOSum;
        
    }
}

class Assignment48_1
{
    public static void main(String arg[])
    {
        ArrayDemo obj = new ArrayDemo();
        int iRet = obj.Difference();
        System.out.println("Difference between Summation of even and odd elements is: "+iRet);
    }
}
