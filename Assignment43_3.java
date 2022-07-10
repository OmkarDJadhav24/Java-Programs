// Write java program to accept directory name from user and create that directory.

import java.io.*; 

class CreateDirectory
{
    public void DirCreate()
    {
        File f = new File("/home/omkar/Edrive/JavaDir"); 

	if (f.mkdir() == true) 
	{ 
		System.out.println("Directory has been created successfully"); 
	} 
	else 
	{ 
		System.out.println("Directory cannot be created"); 
	} 
    }
}

class Assignment43_3
{ 
	public static void main(String args[]) 
	{ 
	     CreateDirectory obj = new CreateDirectory();
	     obj.DirCreate();
	} 
} 

