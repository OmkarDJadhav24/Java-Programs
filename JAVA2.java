import java.lang.*;
import java.util.*;

class ArrayX
{
   private int iSize;
   private int Arr[];
   
   public ArrayX(int iValue)
   {
      this.iSize = iValue;
      Arr = new int[iSize];
   }
   public void Accept()
   {
      int iCnt = 0;
      System.out.println("Enter the elements:");
      Scanner sobj = new Scanner(System.in);
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
          Arr[iCnt] = sobj.nextInt();
      }
   }
   public void Display()
   {
      int iCnt = 0;
      System.out.println("Elements of Array are:");
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
          System.out.println(Arr[iCnt]);
      }
   }
   
   public int Summation()
   {
      int iSum=0,iCnt=0;
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
         iSum = iSum + Arr[iCnt];
      }
      return iSum;
   }

}
class JAVA2
{
   public static void main(String b[])
   {
      ArrayX aobj = new ArrayX(5);
      int iRet = 0;
      
      aobj.Accept();
      aobj.Display();
      iRet=aobj.Summation();
      System.out.println("Addition is:"+iRet);
   }
}
