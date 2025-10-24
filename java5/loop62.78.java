import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        int a = 1;
        System.out.println("Pattern :");
        for (int i = 1; i <= n; i++) 
        {
            for ( int sp = n; sp > i; sp--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) 
        {
            for ( int sp = 1; sp <= a ; sp++ )
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }
            System.out.println();
            a++;
        }
    }
}