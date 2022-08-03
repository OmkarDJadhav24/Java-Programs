// Write a java program to reverse the words of string.

import java.lang.*;
import java.util.*;

class MyString
{
    public String Str;
    
    public MyString(String Ch)
    {
        Str = Ch;
    }
    
    public void Display()
    {
        System.out.println("String is: "+Str);
    }
    
    public void ReverseStr()
    { 
        String Arr[] = Str.split(" ");
        int iStart = 0;
        int iEnd = Arr.length-1;
        String iTemp = Arr[0];       
        for(int i=0;i<Arr.length;i++)
        {
            if(iStart < iEnd)
            {
                iTemp = Arr[iStart];
                Arr[iStart] = Arr[iEnd];
                Arr[iEnd] = iTemp;
                iStart++;
                iEnd--;
            }
            else
            {
                break;
            }
        }
        System.out.println("After reverse string is : ");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
}

class String4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String Str = sobj.nextLine();
        
        MyString mobj = new MyString(Str);
        mobj.Display();
        mobj.ReverseStr();
        //mobj.Display();
    }
}
