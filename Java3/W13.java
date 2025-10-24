import java.util.Scanner;
class W  
{
    public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    double num1 = sc.nextDouble();
    System.out.println("Enter second number:");
    double num2 = sc.nextDouble();
    System.out.println("Choose an operation:");
    System.out.println("1. Addition (+)");
    System.out.println("2. Subtraction (-)");
    System.out.println("3. Multiplication (*)");
    System.out.println("4. Division (/)");
    System.out.println("5. Modulous (%)");
    int choice = sc.nextInt();
    double result;
    switch (choice) 
    {
    case 1:
    double result1= num1 + num2;
    System.out.println("result="+result1);
    break;
    case 2:
    double result2= num1 - num2;
    System.out.println("result="+result2);
    break;
    case 3:
    double result3= num1 * num2;
    System.out.println("result="+result3);
    break;
    case 4:
    if (num2 != 0) {
    double result4= num1 / num2;
    System.out.println("result="+result4);
    } 
    else 
    {
    System.out.println("Error: Division by zero is not allowed.");
    }
    break;
    case 5:
    double result5= num1 % num2;
    System.out.println("result="+result5);
    break;
    default:
    System.out.println("Invalid choice. Please select a number between 1 and 5.");
        }
    }
}

