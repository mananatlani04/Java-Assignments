/*
    1
   212
  32123
 4321234
543212345
*/
import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int n = sc.nextInt();
        int a = 1;
        System.out.println("Pattern :");
        for (int i = 1; i <= n * 2; i += 2,a++) 
        {
            for (int sp = n - 1; sp * 2 > i; sp--) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(a);
            }
            System.out.println();
        }
        sc.close();
    }
}