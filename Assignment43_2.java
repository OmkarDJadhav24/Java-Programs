// Write a java program which accept file name from user and check if it is regular file or not.
import java.io.File;
import java.io.IOException;

class CheckRegular
{
    public void IsRegular()
    {
        File file = new File("/home/omkar/Edrive/marvellous2.txt");

        if (file.isFile()) 
        {
            System.out.println("File is a regular file.");
        } 
        else 
        {
            System.out.println("File denoted by this pathname not exists or is not a regular file.");
        }
    }
}

class Assignment43_2 
{
    public static void main(String[] args) throws IOException 
    {
        CheckRegular obj = new CheckRegular();
        obj.IsRegular();
    }
}
