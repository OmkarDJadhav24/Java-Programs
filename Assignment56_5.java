// Write a java program which accept numbr of rows and number of columns from user and display below pattern.

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
        for(int i = 1;i<=this.iRow+1;i++)
        {
            for(int j=1;j<=this.iCol+1;j++)
            {
                if((i==1) || (i==iRow+1) || (j==1) || (j==iCol+1) || (i==j))
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print("\t");    
                }
            }
            System.out.println();
        }
    }
}
class Assignment56_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number of rows:");
        int iRows = sobj.nextInt();
        
        System.out.println("Enter number of columns:");
        int iCols = sobj.nextInt();
        
        Pattern pobj = new Pattern(iRows,iCols);
        pobj.DisplayPattern();
    }
}
