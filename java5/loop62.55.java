import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        for( int i = n; i >= 1; i--)
        {
            char a = 'A';
            for( int sp = n; sp >= i; sp--)
            {
                System.out.print(" ");
            }
            for( int j = i; j >= 1; j--,a++)
            {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}