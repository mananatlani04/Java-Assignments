import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Digit You Want To Find");
        int S = sc.nextInt();
        System.out.println("Enter Elements");
        for ( int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for ( int i = 0; i < n; i++)
        {
            int sum = 0;
            for ( int j = i; j < n; j++)
            {
                sum += arr[j];
                if ( sum == S )
                {
                    System.out.println("position :" + (i  + 1) + " to " + (j + 1));
                }
            }
        }
    }
}