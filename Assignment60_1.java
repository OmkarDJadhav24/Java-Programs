// Write a java program which accept array of characters from user and replace each capital character with its corresponding small character.

import java.lang.*;
import java.util.*;

class MyArray
{
    public char Arr[];
    public int iNo;
    
    public MyArray(int iSize)
    {
        iNo = iSize;
    }
    
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        Arr = new char[iNo];
        
        System.out.println("Enter the string:");
        String str = sobj.nextLine();
        str = str.toLowerCase();
        
        Arr = str.toCharArray();
    }
    
    public void Display()
    {
        System.out.println("Elements of array are: ");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
    
    
}
class Assignment60_1
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int iSize = obj.nextInt();
        
        MyArray mobj = new MyArray(iSize);
        mobj.Accept();
        mobj.Display();
       
    }

}
