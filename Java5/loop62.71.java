import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        int a = n;
        for( int i = 1; i <= n; i++)
        {
            int b = 1;
            for(int sp = 1; sp <= i; sp++)
            {
                System.out.print(" ");
            }
            for( int j = n; j > i - a; j--,b++)
            {
                System.out.print(b);
            }
            a--;
            System.out.println();
        }
    }
}