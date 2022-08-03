// Write a java program to display below pattern.
/*
input 78956
output
    7 8 9 5 6
    7 8 9 5 6
    7 8 9 5 6
    7 8 9 5 6
    7 8 9 5 6
    
*/

import java.lang.*;
import java.util.*;

class MyString
{
    public String str;
    
    public MyString(String S)
    {
        this.str = S;
    }
    
    public void DisplayPattern()
    {
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }
    }
}

class String12
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sobj.nextLine();
        
        MyString mobj = new MyString(str);
        mobj.DisplayPattern();
    }
}
