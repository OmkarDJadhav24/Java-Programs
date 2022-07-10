import java.io.*;
import java.util.*;

class ArrayDemo
{
    public void Display()
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int iRange = sobj.nextInt();
        
        int Arr[] = new int[iRange];
        int i = 0;
        
        System.out.println("Enter the elements:");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Numbers are even and divisible by 5 are: ");
        for(i=0;i<Arr.length;i++)
        {
            if(((Arr[i]%5)==0) && ((Arr[i]%2)==0))
            {
                System.out.println(Arr[i]);
            }
            
        }
    
    }
}

class Assignment48_3
{
    public static void main(String arg[])
    {
        ArrayDemo obj = new ArrayDemo();
        obj.Display();
        
    }
}
