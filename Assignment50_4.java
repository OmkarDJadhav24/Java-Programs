import java.io.*;
import java.util.*;

class ArrayX
{
    public void DisplayRange()
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int iRange = sobj.nextInt();
        
        int Arr[] = new int[iRange];
        int i=0;
        
        System.out.println("Enter the elements:");
        for(i=0;i<iRange;i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Enter the number of starting range:");
        int iStart = sobj.nextInt();
        
        System.out.println("Enter the number of ending range:");
        int iEnd = sobj.nextInt();
        
        System.out.println("Elements of range are:");
        for(i=0;i<iRange;i++)
        {
            if((Arr[i]>=iStart) && (Arr[i]<=iEnd))
            {
                System.out.println(Arr[i]);
            }
        }
        
    }
}
class Assignment50_4
{
    public static void main(String arg[])
    {
        ArrayX obj = new ArrayX();
        obj.DisplayRange();
    }
}
