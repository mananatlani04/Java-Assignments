/*
----------------------------------
*     *
 *   *
  * *
   *
  * *
 *   *
*     *
------------------------------------
*/
import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        System.out.println("Pattern :");
        for (int i = n; i >= 1; i--) 
        {
            for (int sp = 1; sp <= n - i; sp++) System.out.print(" ");
            System.out.print("*");
            if (i > 1) 
            {
                for (int sp = 1; sp <= (i - 1) * 2 - 1; sp++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) 
        {
            for (int sp = 1; sp <= n - i; sp++) System.out.print(" ");
            System.out.print("*");
            if (i > 1) 
            {
                for (int sp = 1; sp <= (i - 1) * 2 - 1; sp++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}