import java.lang.*;
import java.util.*;

class Pattern
{
    public int iRow;
    public int iCol;
    
    public Pattern(int iNo1,int iNo2)
    {
        iRow = iNo1;
        iCol = iNo2;
    }
    
    public void DisplayPattern()
    {
         for(int i=1;i<=iRow+1;i++)
         {
             for(int j=1;j<=iCol;j++)
             {
                 System.out.print(i+"\t");
             }
             System.out.println();
         }
    }
}
class Assignment53_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int iNo1 = sobj.nextInt();
        
        System.out.println("Enter number of columns:");
        int iNo2 = sobj.nextInt();
        
        Pattern pobj = new Pattern(iNo1,iNo2);
        pobj.DisplayPattern();
    }
}
