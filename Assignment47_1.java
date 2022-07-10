import java.io.*;
import java.util.*;

class StringDemo
{
    public int  CountCapital(String str)
    {
        int i = 0;
        int iCnt = 0;
        
        char[] ch = new char[str.length()];
        
        for(i=0;i<str.length();i++)
        {
            ch[i] = str.charAt(i);
        }
        
        for(i=0;i<str.length();i++)
        {
            if((ch[i]>='A') && (ch[i]<='Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Assignment47_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sobj.nextLine();
        
        StringDemo dobj = new StringDemo();
        int iRet = dobj.CountCapital(str);
        System.out.println("Count of Capital letters is: "+iRet);
    }

}
