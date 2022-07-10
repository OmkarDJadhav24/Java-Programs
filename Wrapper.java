import java.io.*;

class Wrapper
{
   public static void main(String a[])throws IOException
   {   
       int no = 11;
       
       Integer iobj = new Integer(12);
       
       int i = iobj;                  //Unboxing
       
       Integer iobj2 = no;            //Boxing
   }
}
