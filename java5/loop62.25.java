/*
5
54
543
5432
54321
*/

import java.util.Scanner;
class loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 5; i >= 1; i--)
        {
            for(int j = 5; j >= i; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}