// Write a java program to find length of largest words.

import java.lang.*;
import java.util.*;

class MyString
{
    public String Str;
    
    public MyString(String Ch)
    {
        Str = Ch;
    }
    
    public void CountMaxLength()
    { 
        String Arr[] = Str.split(" ");
        
        int iLen = Arr[0].length();
        String str = " ";
        
        for(int i=0;i<Arr.length;i++)
        {
           if(iLen<Arr[i].length())
           {
               iLen = Arr[i].length()	;
               str = Arr[i];
           }
        }
        System.out.println("Maximum length is "+iLen+" of word "+str);
    }
}

class String3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String Str = sobj.nextLine();
        
        MyString mobj = new MyString(Str);
        mobj.CountMaxLength();
        
    }
}
