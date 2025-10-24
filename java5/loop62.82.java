import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        int a = 0;
        int b = n - 1;
        int c = 1;
        System.out.println("pattern : ");
        for ( int i = 1; i <= n; i++) 
        {
            for ( int sp = n; sp > i; sp--) 
            {
                System.out.print(" ");
            }
            for ( int j = 1; j <= i + a ; j++)
            {
                if( j == 1 || j == i + a )
                System.out.print("*");
                else
                System.out.print("_");
            }
            System.out.println();
            a++;
        }
        for (int i = n - 2; i >= 0; i--) 
        {
            for (int sp = 0; sp < c; sp++) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + b ; j++)
            {
                if( j == 1 || j == i + b )
                System.out.print("*");
                else
                System.out.print("_");
            }
            System.out.println();
            b--;
            c++;
        }
    }
}