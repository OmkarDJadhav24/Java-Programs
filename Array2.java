import java.lang.*;
import java.util.*;

class Array2
{
   public static void main(String a[])
   {
      Scanner sobj = new Scanner(System.in);
      int i = 0;
      int j = 0;
      int Size = 0;
      
      System.out.println("Enter number of elements:");
      Size=sobj.nextInt();
      
      int Arr[][] = new int[2][3];
      
      System.out.println("Enter the elements of Array:");
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
