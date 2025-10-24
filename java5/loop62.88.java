/*
   1
   2
   3
   4
123454321
   4
   3
   2
   1
*/
import java.util.Scanner;
class loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        System.out.println("pattern :");

        int totalWidth = 2 * n - 1;

        for (int i = 1; i <= n; i++)
        {
            for (int sp = 1; sp <= (totalWidth / 2); sp++)
            {
                System.out.print(" ");
            }
            System.out.println(i);
        }

        for (int i = 1; i <= n; i++)
        {
            System.out.print(i);
        }
        for (int i = n - 1; i >= 1; i--)
        {
            System.out.print(i);
        }
        System.out.println();

        for (int i = n; i >= 1; i--)
        {
            for (int sp = 1; sp <= (totalWidth / 2); sp++)
            {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}