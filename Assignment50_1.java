import java.io.*;
import java.util.*;

class ArrayX
{
    public boolean CheckNum()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int iRange = sobj.nextInt();
        
        
        int Arr[] = new int[iRange];
        int iCnt = 0;
        int i=0;
        
        System.out.println("Enter the elements:");
        for(i=0;i<iRange;i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Enter the number to check:");
        int iNo = sobj.nextInt();
        
        
        for(i=0;i<iRange;i++)
        {
            if(iNo == Arr[i])
            {
                iCnt++;
                break;
            }
        }
        
        if(iCnt==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
        
}
class Assignment50_1
{
    public static void main(String arg[])
    {
        ArrayX obj = new ArrayX();
        boolean bRet=obj.CheckNum();
        if(bRet==true)
        {
            System.out.println("Number is present");
        }
        else
        {
            System.out.println("Number is not present");
        }
    }
}
