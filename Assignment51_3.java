// Write a java program which accept two strings from user and check whether first N contents of two Strings are equal or not.
//If third parametr is greater than the size of second string then concate whole string after first string.

import java.lang.*;
import java.util.*;

class StringDemo
{
    public String Str1;
    public String Str2;
    public int iCnt;
    
    public StringDemo(String S1,String S2,int iNo)
    {
        this.Str1 = S1;
        this.Str2 = S2;
        this.iCnt = iNo;
    }
    
    public boolean StrNCmpX()
    {
        char ch1[] = Str1.toCharArray();
        char ch2[] = Str2.toCharArray();
        int i=0;
        
        for(i=0;i<iCnt;i++)
        {
            if(ch1[i] != ch2[i])
            {
                break;
            }
            
        }
        
        
        if(iCnt>ch2.length)
        {
            String Str = Str1+Str2;
            System.out.println(Str);
        }
        
        if(i == iCnt)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Assignment51_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String Str1 = sobj.nextLine();
        
        System.out.println("Enter the second string:");
        String Str2 = sobj.nextLine();
        
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();
        
        StringDemo dobj = new StringDemo(Str1,Str2,iNo);
        boolean bRet = dobj.StrNCmpX();
        if(bRet == true)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
}
