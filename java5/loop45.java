import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) 
        {
            sum += num % 10;
             num /= 10; 
        }
        System.out.println("Sum of digits = " + sum);
    }
}