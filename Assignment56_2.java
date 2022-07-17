// Write a java program which accept numbr of rows and number of columns from user and display below pattern.

import java.lang.*;
import java.util.*;

class Pattern
{
    public int iRow;
    public int iCol;
    public int iCnt;
    
    public Pattern(int iNo1,int iNo2)
    {
        this.iRow = iNo1;
        this.iCol = iNo2;
        this.iCnt = iCol;
    }
    
    public void DisplayPattern()
    {
        for(int i = 1;i<=this.iRow;i++)
        {
            for(int j=1;j<=this.iCol;j++)
            {
                if(j<iCnt)
                {
                    System.out.print("*\t");
                }
                else if(j == iCnt)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("@\t");
                }
            }
            System.out.println();
            iCnt--;
        }
    }
}
class Assignment56_2
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
