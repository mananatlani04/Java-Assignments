import java.util.Scanner;
class W 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num % 5 == 0 && num % 11 == 0) 
        {
            System.out.println(num + " is divisible by both 5 and 11.");
        } 
        else 
        {
            System.out.println(num + " is NOT divisible by both 5 and 11.");
        }
    }
}