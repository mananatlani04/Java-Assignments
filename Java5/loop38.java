
import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int digits = 0;
        int temp = n;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        int sum = 0;
        temp = n;
        while (temp != 0) 
        {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        if (sum == original) 
        {
            System.out.println(original + " is an Armstrong number.");
        } 
        else 
        {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
