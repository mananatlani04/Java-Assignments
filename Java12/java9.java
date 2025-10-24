/* Throws Keyword
👉 Write a method readFile(String fileName) that uses FileReader. 
Declare it with throws IOException and handle it in main().*/
import java.io.*;
import java.text.SimpleDateFormat;
import java.sql.Date;
class Testmain
{
    public static void main(String[] args) 
    {
        File f = new File("abc.txt");
        if(f.exists())
        {
            System.out.println("File Found");
            System.out.println("Name :" + f.getName());
            System.out.println("Absolute Path :" + f.getAbsolutePath());
            long timestamp = f.lastModified();
            SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yy hh/mm/ss/ms");
            String date = sd.format(new Date(timestamp));
            System.out.println("Last Modified Date :" + date);
        }    
        else
        {
            System.out.println("File Not Found");
            try
            {
                f.createNewFile();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}