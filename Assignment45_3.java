import java.io.*;
import java.util.*;

class CheckMax
{
    public int FindMax()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int iRow = sobj.nextInt();
        
        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();
        
        int Arr[][] = new int[iRow][iCol];
        int i=0,j=0,iCnt=0;
        int iMax = 0;
        
        System.out.println("Enter the elements: ");
        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        
        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {
                if(i==j)
                {
                   if(iMax<Arr[i][j])
                   {
                      iMax = Arr[i][j];
                   }
                }
            }
        }
        i=0;
        j=Arr.length-1;
        
        while(i<Arr.length)
        {
            
            if(iMax<Arr[i][j])
            {
                iMax = Arr[i][j];
            }
            i++;
            j--;
        }
        return iMax;
    }
}

class Assignment45_3
{
    public static void main(String arg[])
    {
        CheckMax obj = new CheckMax();
        int iRet = obj.FindMax();
        System.out.println("Maximum Number is : "+iRet);
    }

}
