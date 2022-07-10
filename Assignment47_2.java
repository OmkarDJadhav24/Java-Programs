import java.io.*;
import java.util.*;

class StringDemo
{
    public int  CountSmall(String str)
    {
        int i = 0;
        int iCnt = 0;
        
        char Arr[] = str.toCharArray();
        
        
        for(i=0;i<Arr.length;i++)
        {
            if((Arr[i]>='a') && (Arr[i]<='z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Assignment47_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sobj.nextLine();
        
        StringDemo dobj = new StringDemo();
        int iRet = dobj.CountSmall(str);
        System.out.println("Count of small letters is: "+iRet);
    }

}
