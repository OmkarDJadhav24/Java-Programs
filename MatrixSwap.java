// Write a java program to swap elements of rows of matrix.

import java.lang.*;
import java.util.*;

class MyMatrix
{
    public int Arr[][];
    public int iRow;
    public int iCol;
    
    public MyMatrix(int iNo1,int iNo2)
    {
        iRow = iNo1;
        iCol = iNo2;
        Arr = new int[iRow][iCol];
    }
    
    public void Accept()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                Arr[i][j] = obj.nextInt();
            }
        }
    }
    
    public void Display()
    {
        System.out.println("Elements of matrix are: ");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public void SwapMatrix()
    {
        int iStart = 0;
        int iEnd = 0;
        int i=0,j=0,k=0,iTemp=0;
        for(i=0;i<Arr.length;i++)
        {
            k = Arr[i].length - 1;
            for(j=0;j<Arr[i].length;j++)
            {   
               if(k>j)
               {
                  iStart = Arr[i][i];
                  iEnd = Arr[i][k];
               
                  iTemp = Arr[i][j];
                  Arr[i][j] = Arr[i][k];
                  Arr[i][k] = iTemp;
                  k--;
               }
            }
        }
    }
}

class MatrixSwap
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int iRow = sobj.nextInt();
        
        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();
        
        MyMatrix mobj = new MyMatrix(iRow,iCol);
        mobj.Accept();
        mobj.Display();
        mobj.SwapMatrix();
        mobj.Display();
    }
}
