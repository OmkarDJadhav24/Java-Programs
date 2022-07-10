//Solution in Exception2

import java.util.*;

class Exception2
{
   public static void main(String a[])
   {
      int ans=0,no1=0,no2=0;
      
      Scanner sobj = new Scanner(System.in);
      
      System.out.println("Please enter first number:");
      no1=sobj.nextInt();
      
      System.out.println("Please enter second number:");
      no2=sobj.nextInt();
      
   
      try
      {
        ans=no1/no2;              //Exception prone code
      }
      catch(ArithmeticException obj)
      {
         System.out.println("Exception occured as :"+obj);
      }
      
      finally
      {
          sobj.close();
      }
      
      System.out.println("Division is:"+ans);
      
     
   }
}
