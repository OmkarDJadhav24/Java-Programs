// Write a java program which accept N numbers from user and accept one another number from user as No return index of first occurance of that number.

import java.io.*;
import java.util.*;

class ArrayX
{
    public int FirstOccurance()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int iRange = sobj.nextInt();
        
        
        int Arr[] = new int[iRange];
        int iOcc = 0;
        int i=0;
        
        System.out.println("Enter the elements:");
        for(i=0;i<iRange;i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Enter the number to find occurance:");
        int iNo = sobj.nextInt();
        
        
        for(i=0;i<iRange;i++)
        {
            if(iNo == Arr[i])
            {
                iOcc = i;
                break;
            }
        }
        
        if(i==iRange)
        {
            return -1;
        }
        else
        {
            return i;
        }
    }
        
}
class Assignment50_2
{
    public static void main(String arg[])
    {
        ArrayX obj = new ArrayX();
        int iRet=obj.FirstOccurance();
        if(iRet == -1)
        {
            System.out.println("Number not present");
        }
        else
        {
            System.out.println("Number is present at index: "+iRet);
        }
    }
}
