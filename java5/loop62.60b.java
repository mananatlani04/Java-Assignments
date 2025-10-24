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
            for (int j = 1; j <= i; j++) 
            {
                if( i == n || j == 1 || j == i)
                System.out.print("X"); 
                else
                System.out.print("_");
            }
            a++;
            System.out.println();
        }
    }
}