import java.lang.*;
import java.util.*;

class Array4
{
   public static void main(String a[])
   {
      Scanner sobj=new Scanner(System.in);
      int i=0,j=0;
      
      int Arr[][]=new int[3][];
      
      Arr[0]=new int[3];
      Arr[1]=new int[5];
      Arr[2]=new int[2];
      
      System.out.println("Enter the elements:");
      for(i=0;i<Arr.length;i++)
      {
         for(j=0;j<Arr[i].length;j++)
         {
            Arr[i][j]=sobj.nextInt();
         }
      }
      
      System.out.println("Elements of Array are:");
      for(i=0;i<Arr.length;i++)
      {
         for(j=0;j<Arr[i].length;j++)
         {
             System.out.println(Arr[i][j]);
         }
      }
   }
}
