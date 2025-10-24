/*
a
bc
d f
g  j
klmno
*/

import java.util.Scanner;
class loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        char ch = 'a';
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++,ch++)
            {
                if ( i == j || i == n || j == 1 )
                System.out.print(ch);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}