/*
     1               
    101             
   10101         
  1010101           
 101010101   
10101010101
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
        for (int i = 1; i <= n; i++) 
        {
            for (int sp = 1; sp <= n - i; sp++) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) 
            {
                if (j % 2 == 0) System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        }
    }
}