// Write java program to accept directory name from user and write data of all files along with file name into newly created file named as marvellous.txt.

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.*; 
import java.io.BufferedWriter; 
import java.io.FileWriter;  
import java.io.PrintWriter;


class WriteFileD
{
    public void WriteInFile() throws IOException
    {
        File[] files = new File("/home/omkar/Edrive/LogicBuildingLive/TaskDirectory").listFiles();
        int i = 0;	
        
        FileWriter fw = null; 
        BufferedWriter bw = null; 
        PrintWriter pw = null; 
        
        /*fw = new FileWriter(files, true); 
        bw = new BufferedWriter(fw); 
        pw = new PrintWriter(bw);
        */
	for (File filename : files) 
	{
	       Scanner myReader = new Scanner(filename);      
	       
	       String data = myReader.nextLine();
               System.out.println("Size of "+filename.getName()+" is: "+filename.length()+" Bytes");
                  
               System.out.println("Content of: "+filename.getName()+" is: "+data);
                     
               fw = new FileWriter("marvellous.txt", true); 
               bw = new BufferedWriter(fw); 
               pw = new PrintWriter(bw);     
                 
               
               pw.println(data); 
               pw.println(filename);
               pw.flush();
             
               myReader.close();
            
          
	}
	  
     	System.out.println("Data Wrote successfully in file.");
     	//System.out.println("File names are stored successfully");  
	  
    }
}

class Assignment44_4
{
 
    public static void main(String args[]) throws IOException
    {
        WriteFileD obj = new WriteFileD();
        obj.WriteInFile();
    }
}
