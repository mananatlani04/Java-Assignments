/*2. File Upload System
A web app allows file upload.
But the file path provided by the user does not exist.
Which Java exception will occur?
How would you handle it so the program doesn’t crash?
Should you retry or show a friendly message to the user?*/

import java.io.*;
class Testmain
{
    public static void main(String[] args) 
    {
        try
        {
            File f = new File("/home/pawansahu/Documents/ITEP-15/basic/oops");
            File fileitem[] = f.listFiles();

            for(File item : fileitem)
            {
                if(item.isDirectory())
                {
                    System.out.println(item.getName());
                }
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("file value can't be null | file path doesn't exist");   
        }
    }
}