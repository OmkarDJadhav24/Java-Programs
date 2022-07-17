// Accept string from user and check whether the string is palindrome or not without considering its case.

import java.lang.*;
import java.util.*;

class StringDemo
{
    public String Str;
    
    public StringDemo(String S)
    {
        this.Str = S;
    }
    
    public boolean StrPalindrome()
    {
        char ch[] = Str.toCharArray();
        int i = 0;
        int j = (ch.length)-1;
        
        for(i=0;i<ch.length;i++)
        {
            if((ch[i]>='A') & (ch[i]<='Z'))
            {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        System.out.println(ch);
        
        for(i=0;i<ch.length;i++)
        {
            if(j>i)
            {
                if(ch[i] != ch[j])
                {
                    break;
                }
                j--;
            }
        }
        
        if(i == ch.length)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
}
class Assignment51_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = sobj.nextLine();
        
        StringDemo dobj = new StringDemo(str);
        boolean bRet = dobj.StrPalindrome();
        
        if(bRet == true)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
