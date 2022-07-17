// Write a java program which accept String from user and display below pattern.

import java.lang.*;
import java.util.*;

class Pattern
{
    public String str;
    
    public Pattern(String s)
    {
        this.str = s;
    }
    
    public void DisplayString()
    {
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                if(j<=i)
                {
                    System.out.print(ch[j]+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
class Assignment55_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = sobj.nextLine();
        
        Pattern pobj = new Pattern(str);
        pobj.DisplayString();
    }
}
