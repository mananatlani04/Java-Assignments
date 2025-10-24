/*
1
10
1 1
1  0
10101
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
                if ( i == j || i == n || j == 1 )
                {
                if ( j % 2 != 0 )
                    System.out.print("1");
                else
                    System.out.print("0");
                }
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}