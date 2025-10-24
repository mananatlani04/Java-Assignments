import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        int sum = 1;
        int k = 1;
        for ( int i = 1; i <= n; i++)
        {
            for ( int j = 1; j <= sum ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            sum = sum + k;;
            k++;
        }
    }
}
