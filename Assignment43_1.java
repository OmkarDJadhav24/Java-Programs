// write a java Program to accept two file names from user and open first file and create new file (second name) and copy the data from first file into newly created file.

import java.util.*;
import java.io.File;
import java.awt.Desktop;
import java.io.IOException;
import java.io.BufferedWriter; 
import java.io.FileWriter;  
import java.io.PrintWriter;


class InsertInOne
{
        static String path;
        public static void WriteInFile(String path,String data) throws IOException
        {
            FileWriter fw = null; 
            BufferedWriter bw = null; 
            PrintWriter pw = null; 
            
            
            fw = new FileWriter(path, true); 
            bw = new BufferedWriter(fw); 
            pw = new PrintWriter(bw); 
        
            pw.println(data); 
        
            System.out.println("Data Successfully appended into file"); 
            pw.flush();
            
        }
        
        public static void CreateFile() throws IOException
        {
            File file = new File("/home/omkar/Edrive/marvellous2.txt");  
            boolean result;
           
            result = file.createNewFile(); 
            if(result)      
             {  
                   System.out.println("file created "+file.getCanonicalPath()); 
                   path = file.getCanonicalPath();
                   System.out.println("Path is: "+path); 
                    
             }  
             else  
             {  
                   System.out.println("File already exist at location: "+file.getCanonicalPath());  
             }  
             
                   
        }              
	    
	public void displayFiles() throws IOException
	{
	        File newfiles=new File("/home/omkar/Edrive/LogicBuildingLive/TaskDirectory/lb.txt");
	        
	        CreateFile();
		
	         Scanner myReader = new Scanner(newfiles);
	         while (myReader.hasNextLine()) 
	         {
                     String data = myReader.nextLine();
                     System.out.println("Size of "+newfiles.getName()+" is: "+newfiles.length()+" Bytes");
                  
                     System.out.println("Content of: "+newfiles.getName()+" is: "+data);
                     WriteInFile(path,data);
                 }
                myReader.close();
                   
		
	}
}

class Assignment43_1
{	
	public static void main(String[] args) throws IOException
	{
		
		//File[] files = new File("/home/omkar/Edrive/LogicBuildingLive/TaskDirectory").listFiles();
               
		InsertInOne obj = new InsertInOne();
		obj.displayFiles();
	}
}

