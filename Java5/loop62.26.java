/*
*
*#
*#*
*#*#
*#*#*
*/

import java.util.Scanner;
class loop 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        System.out.println("pattern:");
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                if (j % 2 == 0)
                    System.out.print("#");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}