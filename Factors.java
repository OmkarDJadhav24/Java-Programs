import java.io.*;

class FactorX
{
    public void CheckFactors(int iNo)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=(iNo/2);iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class Factors
{
   public static void main(String a[])throws IOException
   {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
      
        System.out.println("Enter the number:");
        int iValue = Integer.parseInt(bobj.readLine());
        
        FactorX fobj = new FactorX();
        fobj.CheckFactors(iValue);
        
   }
}
