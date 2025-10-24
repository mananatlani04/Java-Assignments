import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        int a = 0;
        System.out.println("pattern : ");
        for (int i = 1; i <= n; i++) 
        {
            for (int sp = n; sp > i; sp--) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + a; j++) 
            {
                if( j == i )
                System.out.print("#"); 
                else
                System.out.print("*");
            }
            a++;
            System.out.println();
        }
    }
}