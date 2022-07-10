// Program to append data from existing text files of perticular directory to new created text file.

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
            File file = new File("/home/omkar/Edrive/marvellous.txt");  
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
       
	public static void ReadFile(File[] files,int iCnt) throws IOException
	{
	    CreateFile();
	    try
	    {
	        if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
                  {  
                    System.out.println("not supported");  
                    return;  
	          }
	        Desktop desktop = Desktop.getDesktop();  
                for (File filename : files) 
		{
		       //desktop.open(filename);
		       Scanner myReader = new Scanner(filename);
		       while (myReader.hasNextLine()) 
		       {
                             String data = myReader.nextLine();
                             System.out.println("Size of "+filename.getName()+" is: "+filename.length()+" Bytes");
                          
                             System.out.println("Content of: "+filename.getName()+" is: "+data);
                             WriteInFile(path,data);
                       }
                      myReader.close();
                      System.out.println("Data Wrote successfully in file.");
		}
	     }
	     catch(Exception e)
	     {  
                 e.printStackTrace();  
             } 
             
             
            
         }
	    
	public void displayFiles(File[] files) throws IOException
	{
	        File directory=new File("/home/omkar/Edrive/LogicBuildingLive/TaskDirectory");
	        int fileCount=directory.list().length;
                System.out.println("File Count:"+fileCount);
		
		for (File filename : files) 
		{
			System.out.println("File: "+ filename.getName());
		}
		
		ReadFile(files,fileCount);
		
	}
}

class task
{	
	public static void main(String[] args) throws IOException
	{
		
		File[] files = new File("/home/omkar/Edrive/LogicBuildingLive/TaskDirectory").listFiles();
               
		InsertInOne obj = new InsertInOne();
		obj.displayFiles(files);
	}
}

