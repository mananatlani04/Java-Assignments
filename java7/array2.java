import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int minimum = 0;
        int maximum = 0;
        System.out.println("enter elements");
        for ( int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for ( int i = 0; i < n - 1; i++)
        {
            if ( arr[i] < arr[i + 1])
            {
                maximum = arr[i + 1];
            }
        }
        for ( int i = 0; i < n; i++)
        {
            if ( arr[i] < arr[i + 1])
            {
                minimum = arr[i];
                break;
            }
        }
        System.out.println("minimum element:"+ minimum);
        System.out.println("maximum element:"+ maximum);
    }
}