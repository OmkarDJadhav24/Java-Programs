import java.lang.*;

class thread1
{
   public static void main(String a[])
   {
       Thread tobj=Thread.currentThread();
       System.out.println("Current Thread is:"+tobj.getName());
   }
}
