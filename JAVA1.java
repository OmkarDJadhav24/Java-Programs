import java.lang.*;
import java.util.*;

class Number
{
   private int iNo;
      
   public void Accept()
   {
      System.out.println("Enter the number:");
      Scanner sobj = new Scanner(System.in);
      this.iNo = sobj.nextInt();
   }
   
   public void Display()
   {
      System.out.println(this.iNo);
   }
   
   public int Factorial()
   {
      int iFact = 1;
      int iCnt = 0;
      
      for(iCnt=1;iCnt<=iNo;iCnt++)
      {
         iFact = iFact * iCnt;
      }
      return iFact;
   }
}
class JAVA1
{
   public static void main(String b[])
   {
      Number nobj = new Number();
      int iRet = 0;
      nobj.Accept();
      nobj.Display();
      iRet=nobj.Factorial();
      System.out.println("Factorial is:"+iRet);
      
   }

}
