// Write a java program which accept marks from N students and display the class of each student.

import java.lang.*;
import java.util.*;

class MyArray
{
    public float Arr[];
    public int iNo;
    
    public MyArray(int iSize)
    {
        iNo = iSize;
    }
    
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        Arr = new float[iNo];
        
        System.out.println("Enter the marks:");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i] = sobj.nextFloat();
        }
    }
    
    public void Percentage()
    {
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i]<35)
            {
                System.out.println(Arr[i]+": "+"Fail");
            }
            else if((Arr[i]>=35) & (Arr[i]<50))
            {
                System.out.println(Arr[i]+": "+"Pass class");
            }
            else if((Arr[i]>=50) & (Arr[i]<60))
            {
                System.out.println(Arr[i]+": "+"Second class");
            }
            else if((Arr[i]>=60) & (Arr[i]<70))
            {
                System.out.println(Arr[i]+": "+"First class");
            }
            else if((Arr[i]>=70) & (Arr[i]<100))
            {
                System.out.println(Arr[i]+": "+"First class with distinction");
            }
        }
    }
}

class Assignment59_5
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int iSize = obj.nextInt();
        
        MyArray mobj = new MyArray(iSize);
        mobj.Accept();
        mobj.Percentage();
    }

}
