/*
***** *****
****  ****
***   ***
**    **
*     *
*     *
**    **
***   ***
****  ****
***** *****
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
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int s = 1; s <= n - i + 1; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int s = 1; s <= n - i + 1; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}