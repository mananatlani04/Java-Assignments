import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        for( int i = 1; i <= n; i++)
        {
            for(int sp = n; sp > i; sp--)
            {
                System.out.print(" ");
            }
            for( int j = 1; j <= i; j++)
            {
                if( j % 2 == 0 )
                System.out.print("0");
                else
                System.out.print("1");
            }
            System.out.println();
        }
    }
}