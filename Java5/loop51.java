import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int s = sc.nextInt();
        System.out.print("Enter ending number: ");
        int e = sc.nextInt();
        System.out.println("Reversed numbers between " + s + " and " + e + ":");
        for (int i = s; i <= e; i++) 
        {
            int num = i;
            int reversed = 0;
            while (num > 0) 
            {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 10;
            }
            System.out.print(reversed + " ");
        }
    }
}