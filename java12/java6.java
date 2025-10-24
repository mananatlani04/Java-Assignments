/*6. Finally Block Practice

👉 Open a Scanner, read an input, and always close the scanner in finally (show that finally always executes).*/

import java.util.Scanner;
import java.util.InputMismatchException;
class A
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("enter no1");
            int a = sc.nextInt();
            System.out.println("enter no2");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator can't be zero");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter valid value");
        }
        finally
        {
            sc.close();
            System.out.println("Scanner closed");
        }
    }
}