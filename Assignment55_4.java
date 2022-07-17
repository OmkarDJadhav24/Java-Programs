// Write a java program which accept String from user and display below pattern.

import java.lang.*;
import java.util.*;

class Pattern
{
    public String str;
    public int iCnt;
    
    public Pattern(String s)
    {
        this.str = s;
        this.iCnt = 0;
    }
    
    public void DisplayString()
    {
        char ch[] = str.toCharArray();
        iCnt = ch.length;
        
        for(int i=0;i<(ch.length*2)-1;i++)
        {
            if(i<ch.length)
            {
                for(int j=0;j<ch.length;j++)
                {
                    if(j<iCnt)
                    {
                        System.out.print(ch[j]+"\t");
                    }
                    else
                    {
                        System.out.print("*\t");   
                    }
                }
                iCnt--;
            }
            
            else
            {
                
                for(int j=0;j<ch.length;j++)
                {
                    if(j<iCnt+2)
                    {
                        System.out.print(ch[j]+"\t");
                    }
                    else
                    {
                        System.out.print("*\t");   
                    }
                }
                iCnt++;
            }
            
            System.out.println();
        }
    }
}
class Assignment55_4
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
