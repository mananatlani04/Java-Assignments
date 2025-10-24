import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int temp = 0;
        System.out.println("enter digit");
        int k = sc.nextInt(); 
        int arr[] = new int[n];
        System.out.println("enter elements");
        for ( int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for ( int i = 0; i < n; i++)
        {
            for ( int j = i + 1; j < n; j++)
            {
                if ( arr[i] > arr[j] )
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        
        for ( int i = 0; i < n; i++)
        {
            if ( i == k - 1 )
            {
                System.out.println(k + " shortest number :" + arr[i]);
            }
            if ( i == n - k )
            {
                System.out.println(k + " Largest number :" + arr[i]);
            }
        }
    }
}