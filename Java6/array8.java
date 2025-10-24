// 8. WAP to insert a element in array at specific position.
import java.util.Scanner;

class array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n, pos, elem;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter position to insert: ");
        pos = sc.nextInt();
        System.out.print("Enter element to insert: ");
        elem = sc.nextInt();
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = elem;
        n++;
        System.out.print("Array after insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
