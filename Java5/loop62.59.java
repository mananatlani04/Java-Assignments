import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        for( int i = 0; i <= n; i++)
        {
            char a = 'A';
            for( int j = 0; j < n; j++)
            {
                if (j >= n - i)
                {
                System.out.print(a + " ");
                a++;
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}