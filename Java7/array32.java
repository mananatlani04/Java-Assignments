import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int[] b = new int[100];
        int[] c = new int[200];
        int m, n, left = 0, right = 199;
        System.out.print("Enter size of A: ");
        m = sc.nextInt();
        System.out.print("Enter elements of A: ");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter size of B: ");
        n = sc.nextInt();
        System.out.print("Enter elements of B: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            if (a[i] % 2 == 0) {
                c[left++] = a[i];
            }
        }
        for (int i = 0; i < m; i++) {
            if (a[i] % 2 != 0) {
                c[right--] = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (b[i] % 2 == 0) {
                c[left++] = b[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (b[i] % 2 != 0) {
                c[right--] = b[i];
            }
        }
        System.out.print("Resultant array C: ");
        for (int i = 0; i < left; i++) {
            System.out.print(c[i] + " ");
        }
        for (int i = 199; i > right; i--) {
            System.out.print(c[i] + " ");
        }
    }
}