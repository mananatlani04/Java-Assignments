import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt(); 
        System.out.println("pattern : ");
        for (int i = 1; i <= n * 2; i += 2) 
        {
            for (int sp = n; sp * 2 > i; sp--) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                if( i == j || i == 1 || j == 1 || i > n + 2 )
                System.out.print("*"); 
                else
                System.out.print("_");
            }
            System.out.println();
        }
    }
}