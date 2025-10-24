import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int maxLen = 1;
        int currLen = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currLen++;
            } else if (arr[i] != arr[i - 1]) {
                currLen = 1;
            }
            if (currLen > maxLen) {
                maxLen = currLen;
            }
        }
        System.out.println("Longest consecutive subsequence length: " + maxLen);
    }
}