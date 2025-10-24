import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms(n): ");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=i*7;
            System.out.println(a);
        }
        scanner.close();
    }
}