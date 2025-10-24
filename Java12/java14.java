/*4. E-commerce Discount Calculation

Suppose you are dividing total amount by quantity to get per item price. If quantity = 0, what happens?

Which exception will occur?

How will you ensure the program continues and doesn’t stop execution?*/

import java.util.Scanner;
class Zero
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Amount");
        int a = sc.nextInt();
        System.out.println("Enter Quantity");
        int b = sc.nextInt();
        try
        {
        int c = a/b;
        System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator can't be zero");
        }
        finally
        {
            sc.close();
        }
    }
}