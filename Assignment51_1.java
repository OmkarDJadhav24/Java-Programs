import java.lang.*;
import java.util.*;
import java.io.*;

class Pattern
{
    public String str1;
    public String str2;
    public int iCnt;
    
    public Pattern(String s1, String s2,int iNo)
    {
       this.str1 = s1;
       this.str2 = s2;
       this.iCnt = iNo;
    }
    
    public void StrNCatX()
    {
       
       //str1 = toString(ch1);
       char ch1[] = str2.toCharArray();
       char ch2[];
       int j = 0;
       
       for(int i=0;i<ch1.length;i++)
       {
           if(iCnt>i)
           {
               ch2[i] = ch1[i];
               
           }
       }
       String str4 = toString(ch2);
       String str3 =  str1 + str4;
       System.out.println(str3);
       //str1.concatestr(str2)
    }
}

class Assignment51_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the first String:");
        String s1 = sobj.nextLine();
        
        System.out.println("Enter the second String:");
        String s2 = sobj.nextLine();
        
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();
        
        Pattern pobj = new Pattern(s1,s2,iNo);
        pobj.StrNCatX();
    }
}
