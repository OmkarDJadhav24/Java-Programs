import java.io.*;
import java.util.*;

class ArrayX
{
    public int LastNum()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int iRange = sobj.nextInt();
        
        int Arr[] = new int[iRange];
        int i=0;
        int LOcc = -1;
        
        System.out.println("Enter the elements:");
        for(i=0;i<iRange;i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Enter the number to find last occurance:");
        int iNo = sobj.nextInt();
        
        
        for(i=0;i<iRange;i++)
        {
            if(iNo == Arr[i])
            {
                LOcc = i;
            }
        }
        
        return LOcc;
    }
}
class Assignment50_3
{
    public static void main(String arg[])
    {
        ArrayX obj = new ArrayX();
        int iRet=obj.LastNum();
        if(iRet == -1)
        {
            System.out.println("There is no such number:");
        }
        else
        {
            System.out.println("Last occurance of number at index: "+iRet);
        }
    }
}
