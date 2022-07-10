// Write java program to accept directory name from user and display all the names of files of the directory.

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

class ListRFiles
{
    public void FindRFiles() throws Exception
    {
        File[] files = new File("/home/omkar/Edrive/LogicBuildingLive/TaskDirectory").listFiles();
        int i = 0;	
	for (File filename : files) 
	{
	     if (filename.isFile()) 
             {
                 System.out.println("File: "+ filename.getName());
		  i++;
             }     
		
	}
	System.out.println("Count of regular files is : "+i);
	  
    }
}

class Assignment44_1
{
 
    public static void main(String args[]) throws Exception
    {
        ListRFiles obj = new ListRFiles();
        obj.FindRFiles();
    }
}
