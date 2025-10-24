/*10.WAP to to count the occurance of all element in array.*/
import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] freq = new int[100];
        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (freq[i] == -1) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        freq[j] = 0;
                    }
                }
                freq[i] = count;
            }
        }
        System.out.println("Element : Frequency");
        for (int i = 0; i < n; i++) {
            if (freq[i] != 0) {
                System.out.println(arr[i] + " : " + freq[i]);
            }
        }
    }
}
