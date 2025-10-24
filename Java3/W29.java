import java.util.Scanner;
class W 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice (+, >, ==): ");
        String choice = sc.nextLine().trim();
        if (!choice.equals("+") && !choice.equals(">") && !choice.equals("==")) {
            System.out.println("Invalid choice!");
            return;
        }
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        if (choice.equals("+")) 
        {
            System.out.println("Sum: " + (num1 + num2));
        } 
        else if (choice.equals(">")) 
        {
            if (num1 > num2) 
            {
                System.out.println(num1 + " is greater than " + num2);
            } 
            else if (num2 > num1) 
            {
                System.out.println(num2 + " is greater than " + num1);
            } 
            else
            {
                System.out.println("Both numbers are equal.");
            }
        } 
        else if (choice.equals("=="))
        {
            if (num1 == num2) {
                System.out.println("Both numbers are equal.");
            } 
            else 
            {
                System.out.println("Numbers are not equal.");
            }
        }
    }
}