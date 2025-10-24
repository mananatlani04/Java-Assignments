import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements");
        for ( int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for ( int i = 0; i < n; i++)
        {
            for ( int j = i + 1; j < n; j++)
            {
                int temp = 0;
                if ( arr[i] < 0 && arr[j] >= 0 )
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }   
            }
        }
        for ( int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}