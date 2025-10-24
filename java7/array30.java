import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int[] b = new int[100];
        int[] c = new int[200];
        int m, n;
        System.out.print("Enter size of A: ");
        m = sc.nextInt();
        System.out.print("Enter ascending elements of A: ");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter size of B: ");
        n = sc.nextInt();
        System.out.print("Enter descending elements of B: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            c[m + i] = b[n - 1 - i];
        }
        int size = m + n;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        System.out.print("Merged array in ascending order: ");
        for (int i = 0; i < size; i++) {
            System.out.print(c[i] + " ");
        }
    }
}