// Write a java program which accept array of characters from user and count vowels.

import java.lang.*;
import java.util.*;

class MyArray
{
    public char Arr[];
    public int iNo;
    
    public MyArray(int iSize)
    {
        iNo = iSize;
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
    
    public int CountVowels()
    {
        int i=0,iCnt=0;
        for(i=0;i<Arr.length;i++)
        {
            if((Arr[i]=='a') | (Arr[i]=='A') | (Arr[i]=='e') | (Arr[i]=='E') | (Arr[i]=='i') | (Arr[i]=='I') | (Arr[i]=='o') | (Arr[i]=='O') | (Arr[i]=='u') | (Arr[i]=='U'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
    
    
}
class Assignment60_2
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int iSize = obj.nextInt();
        
        MyArray mobj = new MyArray(iSize);
        mobj.Accept();
        mobj.Display();
        int iRet = mobj.CountVowels();
        System.out.println("Count of vowels is: "+iRet);
    }

}
