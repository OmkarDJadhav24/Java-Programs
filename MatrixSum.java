//Write a program to display the sum of elements of matrix

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
    
    public int MatrixSum()
    {
        int iSum = 0;
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }
}

class MatrixSum
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
        int iResult = mobj.MatrixSum();
        System.out.println("Addition of elements is: "+iResult);
        
    }
}
