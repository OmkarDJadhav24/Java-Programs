// Write java program to accept file name from user and find checksum of that file and display on screen.

import java.io.FileInputStream;
import java.security.MessageDigest;
import java.io.IOException;

class ChechSumFind
{
    public void FindChkSum() throws Exception
    {
        String filepath = "/home/omkar/Edrive/marvellous2.txt";
 
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
         
        FileInputStream fileInput = new FileInputStream(filepath);
        byte[] dataBytes = new byte[1024];
 
        int bytesRead = 0;
 
        while ((bytesRead = fileInput.read(dataBytes)) != -1) 
        {
            messageDigest.update(dataBytes, 0, bytesRead);
        }
         
 
        byte[] digestBytes = messageDigest.digest();
 
        StringBuffer sb = new StringBuffer("");
         
        for (int i = 0; i < digestBytes.length; i++) 
        {
            sb.append(Integer.toString((digestBytes[i] & 0xff) + 0x100, 16).substring(1));
        }
 
        System.out.println("Checksum for the File: " + sb.toString());
         
        fileInput.close();
    }
}

class Assignment43_4 
{
 
    public static void main(String args[]) throws Exception
    {
        ChechSumFind obj = new ChechSumFind();
        obj.FindChkSum();
    }
}
