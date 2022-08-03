// Write a java program to find count of small letters.

import java.lang.*;
import java.util.*;
import java.io.*;

class MyString
{
    public String Str;
    
    public MyString(String Ch)
    {
        Str = Ch;
    }
    
    public int CountSmall()
    {
        int iCnt = 0;
        char Ch[] = Str.toCharArray();
        
        for(int i=0;i<Ch.length;i++)
        {
            if((Ch[i]>='a') && (Ch[i]<='z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class String1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sobj.nextLine();
        
        MyString mobj = new MyString(str);
        int iRet = mobj.CountSmall();
        System.out.println("Count of small letters is: "+iRet);
    }
}
