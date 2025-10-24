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
            int a = 1;
            for( int sp = 1; sp <= i; sp++)
            {
                System.out.print(" ");
            }
            for( int j = i; j <= n; j++,a++)
            {
                System.out.print(a);
            }
            System.out.println();
        }
        sc.close();
    }
}