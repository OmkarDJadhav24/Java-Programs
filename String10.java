// Write a java program to display below pattern.
// Input : Hello
/* Output : H
            H e
            H e l
            H e l l 
            H e l l o
*/

import java.lang.*;
import java.util.*;


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
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }
    }
}
class String10
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
