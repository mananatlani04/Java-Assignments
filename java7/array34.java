import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n, key;
        boolean found = false;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value to search: ");
        key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element found" : "Element not found");
    }
}