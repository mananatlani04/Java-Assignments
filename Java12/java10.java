/*10. Try-with-Resources
👉 Open a file using try-with-resources (Java 7+) 
and show that the file closes automatically without finally.*/
import java.io.*;
class Testmain
{
    public static void main(String[] args) 
    {
        try(FileInputStream f = new FileInputStream("abc.txt"))
        {
            int x = f.read();
            System.out.println(x);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}