import java.lang.*;
import java.util.*;

class V
{
    public static void main(String arg[])
    {
        Vector <Integer>obj = new Vector<Integer>(12);
        
        obj.add(11);
        obj.add(21);
        obj.add(52);
        obj.add(102);
        obj.add(111);
        obj.add(111);
        
        System.out.println("Capacity of vector is:"+obj.capacity());
        System.out.println("Size of vector is:"+obj.size());       
        
        int i = 0;
        for(i=0;i<obj.size();i++)
        {
           System.out.println(obj.get(i));
        }
        
        int no = 0,cnt = 0;
        for(i=0;i<obj.size();i++)
        {
           no = obj.get(i);
           if(no%2==0)
           {
              cnt++;
           }
        }
        
        System.out.println("Even elements are : "+cnt);
        
        
        Iterator iobj = obj.iterator();
        while(iobj.hasNext())
        {
           System.out.println(iobj.next());
        }
        
        obj.clear();
    }
}
