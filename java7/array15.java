import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n, count = 0;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.print("Enter elements (0s and 1s): ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += (arr[j] == 0) ? -1 : 1;
                if (sum == 0) count++;
            }
        }
        System.out.println("Number of subarrays: " + count);
    }
}