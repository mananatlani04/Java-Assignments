import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements");
        for(int i = 0; i <= n-1; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("enter element you want to find");
        int element = sc.nextInt();
        int i;
        for(i = 0; i <= n; i++)
        {
            if(element == arr[i])
            {
                break;
            }
        }
            if(element == arr[i])
            System.out.println("element found:"+ arr[i] + "    index value:" + i);
            else
            System.out.println("element not found");
            }
        }