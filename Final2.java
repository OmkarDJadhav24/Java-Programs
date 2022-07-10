import java.lang.*;

class Base
{
   public void fun()
   {
       System.out.println("Base Fun");
   }
   
   public final void gun()
   {
        System.out.println("Base gun");
   }
}

class Derived extends Base
{
   public void fun()               //overriding
   { 
      System.out.println("Derived fun");
   }
   
   /*public void gun()
   {
      System.out.println("Derived gun");   //Not Allowed
   }*/

}

class Final2
{
   public static void main(String arr[])
   {
      Derived dobj = new Derived();
      dobj.fun();     //Derived fun
      dobj.gun();     //Base gun
   }
}
