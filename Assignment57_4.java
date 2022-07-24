// Write a java program which accept two arrays and form new array which is comination of contetns of first and second array.

import java.lang.*;
import java.util.*;

class MyArray
{
    public int Arr[];
    public int Brr[];
    public int Crr[];
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
        Crr = new int [iNo1+iNo2];
        int i = 0,j=0;
        
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
        
        System.out.println("Elements in Crr");
        for(i=0;i<10;i++)
        {
            if(i<Arr.length)
            {
                Crr[i] = Arr[i];
            }
            else if (j<Brr.length)
            {
                Crr[i] = Brr[j];
                j++;
            }
        }
    }
    
    public void Display()
    {
        for(int i=0;i<Crr.length;i++)
        {
            System.out.println(Crr[i]);
        }
    }
}

class Assignment57_4
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
        //mobj.ArrayConcate();
        mobj.Display();
    }
}
