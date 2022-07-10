import java.io.*;
import java.util.*;

class StringDemo
{
    public int CountDiff(String str)
    {
        int iCapCnt = 0;
        int iSmallCnt = 0;
        
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if((ch[i]>='A') && (ch[i]<='Z'))
            {
                iCapCnt++;
            }
            else if((ch[i]>='a') && (ch[i]<='z'))
            {
                iSmallCnt++;
            }
            
        }
        return iCapCnt - iSmallCnt;
    }
}

class Assignment47_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sobj.nextLine();
        
        StringDemo dobj = new StringDemo();
        int iRet = dobj.CountDiff(str);
        System.out.println("Difference between Capital and Small characters is: "+iRet);
    }
}
