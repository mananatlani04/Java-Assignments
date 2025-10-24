import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int count = 1;
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
            if ( arr[i] == k )
            {
                for ( int j = i + 1; j < n; j++)
                {
                    if ( arr[i] == arr[j])
                    {
                        count++;
                    }
                }
                break;
            }
            else
            {
                System.out.println("Element Not Found");
                count--;
                break;
            }
        }
        System.out.println(k + " appered " + count + " times");
    }
}
