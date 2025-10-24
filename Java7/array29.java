import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[100];
        int n, val;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.print("Enter sorted elements: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("Enter value to search: ");
        val = sc.nextInt();
        int low = 0;
        int high = n - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (ar[mid] == val) {
                found = true;
                break;
            } else if (ar[mid] < val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(found ? "Element found" : "Element not found");
    }
}