import java.io.*;

class Input
{
    public static void main(String a[]) throws IOException
    {
         InputStreamReader iobj = new InputStreamReader(System.in);
         BufferedReader  bobj = new BufferedReader(iobj);
         
         System.out.println("Enter the string:");
         String str=bobj.readLine();
         
         System.out.println("Enter integer:");
         int ino=Integer.parseInt(bobj.readLine());
         
         System.out.println("Enter float:");
         float fno = Float.parseFloat(bobj.readLine());
         
         System.out.println("Enter double:");
         double dno=Double.parseDouble(bobj.readLine());
         
         System.out.println("Entered String is:"+str);
         System.out.println("Entered integer is:"+ino);
         System.out.println("Entered float is:"+fno);
         System.out.println("Entered double is:"+dno);
    }
}
