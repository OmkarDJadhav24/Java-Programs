// Write a java program to accept file name from user and create that file if it is already not exist.
 
import java.io.*;  
import java.util.*;
import java.io.File;

class CreateFile
{
     public void FCreate() throws IOException
     {
            File file = new File("/home/omkar/Edrive/marvellous1.txt");  
            boolean result;
           
            result = file.createNewFile(); 
            if(result)      
             {  
                   System.out.println("file created "+file.getCanonicalPath()); 
                   String path = file.getCanonicalPath();
                   System.out.println("Path is: "+path); 
                    
             }  
             else  
             {  
                   System.out.println("File already exist at location: "+file.getCanonicalPath());  
             }  
               
     } 
}

public class Assignment42_4
{  
       public static void main(String[] args) throws IOException  
       {  
           CreateFile obj = new CreateFile();
           obj.FCreate();
       }  
}  
