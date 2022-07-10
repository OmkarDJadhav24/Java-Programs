// Write a java program to accept file name from user and open that file in write mode and write some data at the end of that file.

import java.io.*;  

class WriteFile
{
     public void Fwrite()
     {
        try
	{  
     	FileOutputStream fout=new FileOutputStream("Hello.txt");  
     	String s="Marvellous Infosystems";  
     	byte b[]=s.getBytes();                                   //converting string into byte array  
     	fout.write(b);  
     	fout.close();  
     	System.out.println("success...");  
	}
	catch(Exception e){System.out.println(e);} 
     }
}

class Assignment42_3
{  
     public static void main(String args[])
     {  
	 WriteFile obj = new WriteFile();
	 obj.Fwrite();
     }  
} 
