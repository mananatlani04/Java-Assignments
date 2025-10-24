import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        long f = 1;
        if (number < 0) 
        {
            System.out.println("negative number");
        } 
        else 
        {
            for (int i = 1; i <= number; i++) 
            {
                f *= i;
            }
            System.out.println(+ f);
        }
        sc.close();
    }
}