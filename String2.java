// Write a java program to find count of words.

import java.lang.*;
import java.util.*;

class MyString
{
    public String Str;
    
    public MyString(String Ch)
    {
        Str = Ch;
    }
    
    public int CountWords()
    {
        String Arr[] = Str.split(" ");
        return Arr.length;
    }
}

class String2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String Str = sobj.nextLine();
        
        MyString mobj = new MyString(Str);
        int iRet = mobj.CountWords();
        System.out.println("Count of words in String is: "+iRet);
        
    }
}
