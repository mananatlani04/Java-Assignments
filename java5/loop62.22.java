/*
A
AB
A C
A  D
ABCDE
*/

import java.util.Scanner;
class loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        { char ch='A';
            for(int j = 1; j <= i; j++)
            {
                if ( i == j || i == n || j == 1 )
                System.out.print(ch);
                else
                System.out.print(" ");
                ch++;
            }
        
            System.out.println();
        }
    }
}