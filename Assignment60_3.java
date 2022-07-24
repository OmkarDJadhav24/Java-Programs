// Write a java program which accept array of characters from user and count vowels.

import java.lang.*;
import java.util.*;

class MyArray
{
    public char Arr[];
    public char ch;
    public int iNo;
    
    public MyArray(int iSize,char ch1)
    {
        iNo = iSize;
        ch = ch1;
    }
    
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        Arr = new char[iNo];
        
        System.out.println("Enter the string:");
        String str = sobj.nextLine();
        str = str.toLowerCase();
        
        Arr = str.toCharArray();
    }
    
    public void Display()
    {
        System.out.println("Elements of array are: ");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
    
    public int Search()
    {
        int i=0,iCnt=0;
        for(i=0;i<Arr.length;i++)
        {
            if((Arr[i].equals(ch.toLowerCase())) || (Arr[i].equals(ch.toUpperCase())))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
    
    
}
class Assignment60_3
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int iSize = obj.nextInt();
        
        System.out.println("Enter the character:");
        char ch = obj.next().charAt(0);
        
        MyArray mobj = new MyArray(iSize,ch);
        mobj.Accept();
        mobj.Display();
        int iRet = mobj.Search();
        System.out.println("Count of vowels is: "+iRet);
    }

}
