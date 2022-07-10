import java.lang.*;
import java.util.*;

class Array3
{
   public static void main(String a[])
   {
       int i=0,j=0;
       Scanner sobj = new Scanner(System.in);
       
       int Arr[][] = new int[2][3];
       
       Arr[0][0]=11;
       Arr[0][1]=21;
       Arr[0][2]=31;
       Arr[1][0]=41;
       Arr[1][1]=51;
       Arr[1][2]=61;
       
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
