// Write a java program which accept String from user and display below pattern.

import java.lang.*;
import java.util.*;

class Pattern
{
    public String str;
    public int iCnt;
    
    public Pattern(String S)
    {
       this.str =  S;
       this.iCnt = 0;
    }
    
    public void DisplayString()
    {
        char ch[] = str.toCharArray();
        iCnt = ch.length;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<iCnt;j++)
            {
                System.out.print(ch[j]+"\t");
            }
            iCnt--;
            System.out.println();
        }
    }
}
class Assignment54_2
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
