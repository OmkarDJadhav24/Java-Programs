// Write java program which accept number of rows and number of columns from user and display below pattern.

import java.lang.*;
import java.util.*;

class Pattern
{
    public int iRow;
    public int iCol;

    public Pattern(int iNo1,int iNo2)
    {
        this.iRow = iNo1;
        this.iCol = iNo2;
    }
    
    public void DisplayPattern()
    {
        int i=0;
        int j=0;
        char ch = 'A';
        
        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
            ch++;
        }
    }
}

class Assignment52_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        int iNo1 = sobj.nextInt();
        
        
        System.out.println("Enter the number of columns:");
        int iNo2 = sobj.nextInt();
        
        Pattern pobj = new Pattern(iNo1,iNo2);
        pobj.DisplayPattern();
    }
}
