// Write a program which accept two strings from user and check whether contents of two strings are equal or not.

import java.lang.*;
import java.util.*;

class StringDemo
{
    public String Str1;
    public String Str2;
    
    public StringDemo(String S1,String S2)
    {
        this.Str1 = S1;
        this.Str2 = S2;
    }
    
    public boolean StrCmpX()
    {
        if(Str1.equals(Str2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class Assignment51_2
{
	public static void main(String[] args) 
	{
	    Scanner sobj = new Scanner(System.in);
	    
	    System.out.println("Enter the first String:");
	    String S1 = sobj.nextLine();
	    
	    System.out.println("Enter the second String:");
	    String S2 = sobj.nextLine();
	    
	    StringDemo obj = new StringDemo(S1,S2);
	    boolean bRet = obj.StrCmpX();
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

