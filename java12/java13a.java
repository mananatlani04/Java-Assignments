/*3. Online Exam System
A student enters their roll number (integer), but by mistake they enter "abc".
Which exception will occur?
How can you catch it and ask them to re-enter?
Can you use a loop to keep asking until they enter valid input?*/

import java.util.InputMismatchException;
import java.util.Scanner;
class OnlineExamSystem
{
    public int getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter roll no.");
        try
        {
            int b = sc.nextInt();
            return b;
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter valid value");
            return getInput();
        }
        finally
        {
            sc.close();
        }
    }
    public static void main(String args[])
    {
        OnlineExamSystem obj1 = new OnlineExamSystem();
        obj1.getInput();
    }
}