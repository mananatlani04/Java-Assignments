/*5. Multiple Catch Blocks

👉 Take two integers and perform division. Handle both ArithmeticException and InputMismatchException separately.*/

import java.util.Scanner;
import java.util.InputMismatchException;
class A
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
        int c = a/b;
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
        }
        System.out.println("End");
    }
}