// Write a java program to accept file name from user and open that file and display all the contents of that file.

import java.io.*;  

class ReadFile
{
     public void FRead()
     {
        try
	{  
     	FileInputStream fin=new FileInputStream("Hello.txt");  
    	int i=0;  
    	while((i=fin.read())!=-1)
	{  
     	System.out.print((char)i);  
    	}  
    	fin.close();  
	}
	catch(Exception e){System.out.println(e);}  
     }
}

class Fileread
{  
     public static void main(String args[])
     {  
	 ReadFile obj = new ReadFile();
	 obj.FRead();
     }  
} 
