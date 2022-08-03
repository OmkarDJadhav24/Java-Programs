// Write a java program to display below pattern.
// Input : Hello
/* Output : H e l l o
            H e l l o
            H e l l o
            H e l l o
            H e l l o
*/

import java.lang.*;
import java.util.*;
import java.io.*;

class MyString
{
    public String Str;
    
    public MyString(String S)
    {
        this.Str = S;
    }
    
    public void DisplayPattern()
    {
        char ch[] = Str.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }
    }
}
class String7
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sobj.nextLine();
        
        MyString mobj = new MyString(str);
        mobj.DisplayPattern();
    }
}
