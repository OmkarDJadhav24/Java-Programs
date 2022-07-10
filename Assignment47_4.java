import java.io.*;
import java.util.*;

class StringDemo
{
    public boolean CountDiff(String str)
    {
        char ch[] = str.toCharArray();
        int iCnt = 0;
        for(int i=0;i<ch.length;i++)
        {
            if((ch[i]=='a') || (ch[i]=='e') || (ch[i]=='i') || (ch[i]=='o') || (ch[i]=='u'))
            {
                iCnt++;
            }
            
        }
        if(iCnt==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class Assignment47_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sobj.nextLine();
        
        StringDemo dobj = new StringDemo();
        boolean bRet = dobj.CountDiff(str);
        if(bRet==true)
        {
            System.out.println("It contains vowel");
        }
        else
        {
            System.out.println("There is no vowel");
        }
    }
}
