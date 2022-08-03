// Write a java program to check whether strings are anagram or not.

import java.lang.*;
import java.util.*;
import java.io.*;

class MyString
{
    public String Str1;
    public String Str2;
    
    public MyString(String S1,String S2)
    {
        this.Str1 = S1;
        this.Str2 = S2;
    }
    
    public void CheckAnagram()
    {
        char ch1[] = Str1.toCharArray();
        char ch2[] = Str2.toCharArray();
        char iTemp = 'a';
        int iCnt = 0;
        
        if(ch1.length != ch2.length)
        {
            System.out.println("Stringss are not anagram");
            return;
        }
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }
    }
}

class String6
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sobj.nextLine();
        
        System.out.println("Enter the second string:");
        String str2 = sobj.nextLine();
        
        MyString mobj = new MyString(str1,str2);
        mobj.CheckAnagram();
    }
}
