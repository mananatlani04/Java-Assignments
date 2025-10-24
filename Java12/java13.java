/*3. Online Exam System

A student enters their roll number (integer), but by mistake they enter "abc".

Which exception will occur?

How can you catch it and ask them to re-enter?

Can you use a loop to keep asking until they enter valid input?*/

import java.util.Scanner;
import java.util.InputMismatchException;
class OnlineExamSystem
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        boolean valid = false;
        int rollno = 0;
        System.out.println("enter rollno");
        while(!valid)
        {
            try
            {
                rollno = sc.nextInt();
                valid = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("please enter valid value:" + sc.nextLine());
                System.out.println("Re-enter the roll no.");
                // valid = false;
                sc.next();
            }
        }
        System.out.println("Entered Roll No.:" + rollno);
        sc.close();   
    }
}