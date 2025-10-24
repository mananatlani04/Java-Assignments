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
            char ch = 'A';
            for(int sp = n; sp > i; sp--)
            {
                System.out.print(" ");
            }
            for( int j = 1; j <= i; j++,ch++)
            {
                if( i == j || i == n || j == 1 )
                System.out.print(ch);
                else
                System.out.print("_");
            }
            System.out.println();
        }
    }
}