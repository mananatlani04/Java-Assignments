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
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;
            int digits = 0;
            int temp = num;
            while (temp > 0) 
            {
                digits++;
                temp = temp / 10;
            }
            temp = num;
            while (temp > 0) 
            {
                int digit = temp % 10;
                int power = 1;
                for (int j = 0; j < digits; j++) 
                {
                    power = power * digit;
                }
                sum = sum + power;
                temp = temp / 10;
            }
            
            if (sum == num) 
            {
                System.out.print(num + " ");
            }
        }
    }
}