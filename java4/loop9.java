import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms(n): ");
        int n = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) 
        {
            sum += 1.0 / i;
        }
        System.out.println("sum of the series="+ sum);
        scanner.close();
    }
}
