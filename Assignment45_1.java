import java.io.*;
import java.util.*;


class Assignment45_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int iRows = sobj.nextInt();
        
        System.out.println("Enter number of columns : ");
        int iCols = sobj.nextInt();
        
        int i=0,j=0;
        int iSum = 0;
        
        int Arr[][] = new int[iRows][iCols];
        
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
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        System.out.println("Addition of diagonal elements is: "+iSum);   
    }

}
