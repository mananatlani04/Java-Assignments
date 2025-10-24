/*
-----------------------------
*         *
*      *
  *  *
    *
*  *
*      *
*         *
------------------------------
*/
import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size (height): ");
        int n = sc.nextInt();         
        int width = n;
        int borderLen = width + 2;

        for (int k = 0; k < borderLen; k++) System.out.print("-");
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int j = 0; j < width; j++) {
                if (j == i || j == width - 1 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("|");
        }

        for (int k = 0; k < borderLen; k++) System.out.print("-");
        System.out.println();
    }
}