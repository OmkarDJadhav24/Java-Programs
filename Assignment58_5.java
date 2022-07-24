// Write a java program which accept array and check whether that array and the elements of that array are palindrome or not.

import java.lang.*;
import java.util.*;

class MyArray
{
    public int Arr[];
    public int iNo1;

    
    public MyArray(int iN1)
    {
        this.iNo1 = iN1;
    }
    public void Accept()
    {
        Scanner obj = new Scanner(System.in);
        Arr = new int[iNo1];
        int i = 0,j=0;
        
        System.out.println("Enter the elements f array Arr:");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i] = obj.nextInt();
        }
        
        
        
        
    }
    
    public boolean ChkPalindrom()
    {
        int iNo = 0;
        int iRev = 0;
        int iDigit = 0;
        int iCnt = 0;
        for(int i=0;i<Arr.length;i++)
        {
            iNo = Arr[i];
            while(iNo>0)
            {
                iDigit = iNo%10;
                iRev = iRev*10 + iDigit;
                iNo = iNo/10;
            }
            if(iRev == Arr[i])
            {
                iCnt++;
            }
            iRev = 0;
        }
        
        if(iCnt == Arr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}

class Assignment58_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array Arr:");
        int iNo1 = sobj.nextInt();
       
        MyArray mobj = new MyArray(iNo1);
        mobj.Accept();
        boolean bRet = mobj.ChkPalindrom();
        
        if(bRet == true)
        {
            System.out.println("It is Palindrom array");
        }
        else
        {
            System.out.println("It is not palindrom array");
        }
    }
}
