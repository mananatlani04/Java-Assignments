import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[100];
        int n, val;
        boolean found = false;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        System.out.print("Enter value to search: ");
        val = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (p[i] == val) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element found" : "Element not found");
    }
}