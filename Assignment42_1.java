// Write a java program to accept file name from user and open that file.

import java.awt.Desktop;  
import java.io.*;  

class OpenFile
{
     public void Fopen()
     {
        try  
           {  
              File file = new File("/home/omkar/Edrive/marvellous.txt");   
  
	      Desktop desktop = Desktop.getDesktop();  
	      if(file.exists())
	      {       
	         desktop.open(file);
	      }             
           }  
        catch(Exception e)  
        {  
             e.printStackTrace();  
        }  
     } 
}

public class Assignment42_1
{  
       public static void main(String[] args)   
       {  
           OpenFile obj = new OpenFile();
           obj.Fopen();
       }  
}  
