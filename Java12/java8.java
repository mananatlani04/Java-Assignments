/*8. Checked vs Unchecked Exception

👉 Write a program with a method that throws IOException (checked) and another that throws ArithmeticException (unchecked). 
Show the difference in compiler behavior.*/

import java.io.*;

class Excheck
{
    private int a;
    private int b;
    public Excheck(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    public void uncheck()
    {
        try
        {
            int c = a/b;
            System.out.println("C:" + c);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Unchecked Exception");
        }
    }
    public void check()
    {
        try
        {
            FileInputStream fin = new FileInputStream("abc.txt");
        String data = "";
            while(true)
            {
                int x = fin.read();
                if( x == -1 )
                {
                    break;
                }
                data = data + (char)x;
            }
            System.out.println(data);
            System.out.println("End");
            fin.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Checked Exception");
        }
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Excheck obj1 = new Excheck(0, 0);   
        obj1.uncheck(); 
        obj1.check();
    }
}