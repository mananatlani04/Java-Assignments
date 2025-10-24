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
        System.out.println("Perfect numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) 
        {
            int sum = 0;
            for (int i = 1; i < num; i++)
            {
                if (num % i == 0) 
                {
                    sum += i;
                }
            }
            if (sum == num && num != 0) 
            {
                System.out.println(num);
            }
        }
    }
}
