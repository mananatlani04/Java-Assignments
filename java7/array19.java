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
        int maxProd = arr[0];
        int minProd = arr[0];
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            int temp = maxProd;
            maxProd = Math.max(arr[i], Math.max(maxProd * arr[i], minProd * arr[i]));
            minProd = Math.min(arr[i], Math.min(temp * arr[i], minProd * arr[i]));
            result = Math.max(result, maxProd);
        }
        System.out.println("Maximum product: " + result);
    }
}