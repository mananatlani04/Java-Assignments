import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        System.out.println("Palindrome numbers are:");
        for (int i = start; i <= end; i++)
        {
            int num = i;
            int reversed = 0;
            while (num > 0) 
            {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 10;
            }
            if (i == reversed) 
            {
                System.out.print(i + " ");
            }
        }
    }
}