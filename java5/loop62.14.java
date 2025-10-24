/*
1
23
456
78910
*/

import java.util.Scanner;
class loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                sum++;
                System.out.print(sum);
            }
            System.out.println();
        }
    }
}