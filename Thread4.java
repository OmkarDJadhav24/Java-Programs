import java.lang.*;

class Marvellous implements Runnable
{
   public void run()
   {
      System.out.println("Inside Thread:"+Thread.currentThread().getName());
      for(int i=0;i<10;i++)
      {
          System.out.println("Thread Schedule:"+Thread.currentThread().getName()+":"+i);
      }
   }
}
class Thread4
{
   public static void main(String a[])
   {
      Marvellous mobj1 = new Marvellous();
      Thread t1 = new Thread(mobj1,"First");
      
      Marvellous mobj2 = new Marvellous();
      Thread t2 = new Thread(mobj2,"Second");
      
      t1.start();
      t2.start();
   }
}
