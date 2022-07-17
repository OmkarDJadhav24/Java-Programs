// Write a java program which accept numbr of rows and number of columns from user and display below pattern.

import java.lang.*;
import java.util.*;

class Pattern
{
    public int iRow;
    public int iCol;
    public int i;
    public int j;
    
    public Pattern(int iNo1,int iNo2)
    {
        this.iRow = iNo1;
        this.iCol = iNo2;
        this.i = 0;
        this.j = 0;
    }
    public void DisplayPattern()
    {
        int iCnt = iCol; 
        for(i=1;i<=this.iRow;i++)
        {
            for(j=1;j<=this.iCol;j++)
            {
                if((iCnt == j) && (iCnt >0))
                {
                    System.out.print("#\t");
                    iCnt--;
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
class Assignment56_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int iRows = sobj.nextInt();
        
        System.out.println("Enter number of columns: ");
        int iCols = sobj.nextInt();
        
        Pattern pobj = new Pattern(iRows,iCols);
        pobj.DisplayPattern();
    }
}

