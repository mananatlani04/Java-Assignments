import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        for ( int i = 0; i <= n; i++)
        { 
            if( i % 2 == 0 )
            {
            for (int j = 0; j <= n; j++,j++)
            {
                System.out.print(j);
            }
            System.out.println();
            if( i % 2 != 0)
            {
                for( int a = n - 1; a <= 1; a--,a--)
                {
                    System.out.print(a);
                }
                System.out.println();
            }
            }
        }
    }
}