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
        if (start > end) 
        {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int num = start; num <= end; num++) 
        {
            System.out.print("Factors of " + num + ": ");
            for (int i = 1; i <= num; i++) 
            {
                if (num % i == 0) 
                {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
