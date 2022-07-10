import java.util.*;
import java.lang.*;

class Array1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;
        int size = 0;
        
        System.out.println("Enter number of elements:");
        size=sobj.nextInt();
        
        int Arr[] = new int[size];
        System.out.println("Enter elements of array:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        System.out.println("Elements are:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        
    }
}
