/*2. InputMismatchException

Ask the user to enter an integer. If the user enters text instead, catch the exception.

// Expected
Enter an integer: abc
java.util.InputMismatchException caught*/

import java.util.Scanner;
import java.util.InputMismatchException;
class Input
{
    public static void main(String[] args) 
    {
        try
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1");
        int a = sc.nextInt();
        System.out.println("enter no2");
        int b = sc.nextInt();
        int c = a + b;    
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter valid value : Only integers are allowed");
        }
        System.out.println("End");
    }
}
