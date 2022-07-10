import java.io.*;
import java.util.*;

class ArrayX
{
    public int Product()
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int iRange = sobj.nextInt();
        
        int Arr[] = new int[iRange];
        int i=0;
        int iProduct = 1;
        int iCnt = 0;
        
        System.out.println("Enter the elements:");
        for(i=0;i<iRange;i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Product of elements is: ");
        for(i=0;i<iRange;i++)
        {
            if((Arr[i]%2 ) != 0)
            {
                iProduct = iProduct * Arr[i];
                iCnt++;
            }
        }
        if(iCnt==0)
        {
            return -1;
        }
        else
        {
           return iProduct;
        }
        
    }
}
class Assignment50_5
{
    public static void main(String arg[])
    {
        ArrayX obj = new ArrayX();
        int iRet = obj.Product();
        if(iRet == -1)
        {
            System.out.println("There is no such number");
        }
        else
        {
            System.out.println("Product of odd elements is: "+iRet);
        }
    }
}
