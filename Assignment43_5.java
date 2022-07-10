// Write java program to accept directory name from user and display all the names of files of the directory.

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

class ListFiles
{
    public void FindFiles() throws Exception
    {
        File[] files = new File("/home/omkar/Edrive/LogicBuildingLive/TaskDirectory").listFiles();
        int i = 0;	
	for (File filename : files) 
	{
		System.out.println("File: "+ filename.getName());
		i++;
	}
	System.out.println("Count of files is : "+i);
	  
    }
}

class Assignment43_5 
{
 
    public static void main(String args[]) throws Exception
    {
        ListFiles obj = new ListFiles();
        obj.FindFiles();
    }
}
