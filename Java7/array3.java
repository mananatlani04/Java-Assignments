import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int temp = 0;
        int k = n;
        int arr[] = new int[n];
        System.out.println("enter elements");
        for ( int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for ( int i = 0; i < n - n/2; i++, k--)
        {
           temp = arr[k - 1];
           arr[k - 1] = arr[i];
           arr[i] = temp;
        }
        for ( int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + ",");
        }
    }
}