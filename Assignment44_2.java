// Write java program to accept directory name from user and write names of all files from that directory into one newly created file named as marvellous.txt.


import java.io.File;
import java.io.IOException;
import java.io.*; 

class WriteFile
{
    public void WriteInFile() throws Exception
    {
        FileOutputStream fout=new FileOutputStream("marvellous.txt");
        
        
        File[] files = new File("/home/omkar/Edrive/LogicBuildingLive/TaskDirectory").listFiles();
        int i = 0;	
	for (File filename : files) 
	{
	     if (filename.isFile()) 
             {
                 System.out.println("File: "+ filename.getName());
		  String fname = filename.getName();  
     	          byte b[] = fname.getBytes();                                    //converting string into byte array  
     	          fout.write(b); 
             }     
		
	}
	  
     	fout.close();  
     	System.out.println("File names are stored successfully");  
	  
    }
}

class Assignment44_2
{
 
    public static void main(String args[]) throws Exception
    {
        WriteFile obj = new WriteFile();
        obj.WriteInFile();
    }
}
