import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int temp = 0;
        int maximum = 0;
        int maximum2 = 0;
        int minimum = 0;
        int minimum2 = 0; 
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
            System.out.print(arr[i] + " ");
        }
        for ( int i = n - 1; i > 0; i--)
        {
            if ( arr[i] == arr[i - 1])
            {
                continue;
            }
            else if ( arr[i] > arr[i - 1])
            {
                maximum2 = arr[i - 1];
                break;
            }
        }
        if ( maximum2 == maximum )
        {
            System.out.println("All The Elements Are Same");
        }
        else
        System.out.println("2nd largest : " + maximum2);
        for ( int i = 0; i < n; i++)
        {
            for ( int j = i + 1; j < n; j++)
            {
                if ( arr[i] < arr[j] )
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        minimum = arr[n - 1];
        for ( int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        for ( int i = n - 1; i > 0; i--)
        {
            if ( arr[i] == arr[i - 1])
            {
                continue;
            }
            else if ( arr[i] < arr[i - 1])
            {
                minimum2 = arr[i - 1];
                break;
            }
        }
        if ( minimum2 == minimum )
        {
            System.out.println("All The Elements Are Same");
        }
        else
        System.out.println("2nd Smallest : " + minimum2);
    }
}