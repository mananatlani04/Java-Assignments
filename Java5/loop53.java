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
        System.out.println("Strong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) 
        {
            int num = i;
            int sum = 0;
            while (num > 0) 
            {
                int digit = num % 10;
                int fact = 1;
                for (int j = 1; j <= digit; j++) 
                {
                    fact = fact * j;
                }
                sum += fact;
                num = num / 10;
            }
            if (sum == i) 
            {
                System.out.print(i + " ");
            }
        }
    }
}