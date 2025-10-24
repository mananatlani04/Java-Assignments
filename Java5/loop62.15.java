/*
A
BB
CCC
DDDD
EEEEE
*/

import java.util.Scanner;
class loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        char a = 'A';
        for(char i = 0; i <= n; i++)
        {
            for(char j = 0; j <= i; j++)
            {
                System.out.print(a); 
            }
                a++;
               System.out.println();
            }
        }
    }