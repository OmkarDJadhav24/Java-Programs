//Write a program to display the sum of odd elements of rows of matrix.

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
    }
    
    public void Accept()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the elements of matrix:");
        Arr = new int[iRow][iCol];
        
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                Arr[i][j] = obj.nextInt();
            }
        }
    }
    
    public void Display()
    {
       System.out.println("Elements of matrix are: ");
       for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        } 
    }
    
    public void MatrixOddSum()
    {
        int iSum = 0;
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                if((Arr[i][j])%2 != 0)
                {
                   iSum = iSum + Arr[i][j];
                }
            }
            System.out.println("Addition of odd elements of row is: "+iSum);
            iSum = 0;
        }
    }
}

class MatrixOddSum2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        int iNo1 = sobj.nextInt();
        
        System.out.println("Enter the number of columns:");
        int iNo2 = sobj.nextInt();
        
        MyMatrix mobj = new MyMatrix(iNo1,iNo2);
        mobj.Accept();
        mobj.Display();
        mobj.MatrixOddSum();
        
    }
}
