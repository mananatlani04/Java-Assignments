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
            for( int sp = 1; sp <= i; sp++)
            {
                System.out.print(" ");
            }
            for( int j = i; j <= n; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}