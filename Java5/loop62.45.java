import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        int a = n + 1;
        for( int i = 0; i <= n; i++)
        {
            for( int j = 0; j < n; j++)
            {
                if (j >= n - i)
                System.out.print(a);
                else
                System.out.print(" ");
            }
            a--;
            System.out.println();
        }
    }
}