/*3. ArrayIndexOutOfBoundsException

👉 Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// Expected
Enter index: 8
java.lang.ArrayIndexOutOfBoundsException caught*/

import java.util.Scanner;
class OutOfBoundsException
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] a = new int[n];    
        System.out.println("enter elements");
        try
        {
            for ( int i = 0; i <= n; i++ )
            {
                a[i] = sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Too many inputs in the array");
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}