// Write a java program to accept directory name from user and display all names of the files of that directory.
 
import java.io.*;  
import java.util.*;
import java.io.File;

class DisplayDirectory
{
     public void FDisplay() throws IOException
     {
        File[] files = new File("/home/omkar/Edrive/LogicBuildingLive/TaskDirectory").listFiles();
        
	for (File filename : files) 
	{
		System.out.println("File: "+ filename.getName());
	}
                        
     } 
}

public class Assignment42_5
{  
       public static void main(String[] args) throws IOException  
       {  
           DisplayDirectory obj = new DisplayDirectory();
           obj.FDisplay();
       }  
}  
