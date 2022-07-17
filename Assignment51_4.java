// Write a java program which accept two strings from user and check whether first N contents of two Strings are equal or not.
//If third parametr is greater than the size of second string then concate whole string after first string.

import java.lang.*;
import java.util.*;

class StringDemo
{
    public String Str1;
    
    
    public StringDemo(String S1)
    {
        this.Str1 = S1;
        
    }
    
    public void StrRevTogX()
    {
        char ch[] = Str1.toCharArray();
        int i = 0;
        int j = (ch.length)-1;
        char iTemp = 0;
        
        for(i=0;i<ch.length;i++)
        {
            if(j>i)
            {
                iTemp = ch[i];
                ch[i] = ch[j];
                ch[j] = iTemp;
                j--;
            }
        }
        for(i=0;i<ch.length;i++)
        {
            if((ch[i]>='a') & (ch[i]<='z'))
            {
                ch[i] = Character.toUpperCase(ch[i]);
            }
            else if((ch[i]>='A') & (ch[i]<='Z'))
            {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        System.out.println(ch);
    }
}
class Assignment51_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String Str = sobj.nextLine();
        
        StringDemo dobj = new StringDemo(Str);
        dobj.StrRevTogX();
    }
}
