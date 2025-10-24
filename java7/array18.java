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
        int maxSum = arr[0];
        int currSum = arr[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}