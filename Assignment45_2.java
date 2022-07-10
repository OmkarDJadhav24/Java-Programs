import java.io.*;
import java.util.*;

class CheckNumber
{
    public int FindNum()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int iRow = sobj.nextInt();
        
        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();
        
        int Arr[][] = new int[iRow][iCol];
        int iCnt = 0;
        int i=0,j=0;
        
        System.out.println("Enter the elements: ");
        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        
        System.out.println("Enter the number to check: ");
        int iNum = sobj.nextInt();
        
        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {
                if(iNum == Arr[i][j])
                {
                   iCnt++;
                }
            }
        }
        return iCnt;
    }
}

class Assignment45_2
{
    public static void main(String arg[])
    {
        CheckNumber obj = new CheckNumber();
        int iRet = obj.FindNum();
        System.out.println("Frequency of number occured is : "+iRet);
    }

}
