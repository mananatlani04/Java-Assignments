import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[100];
        int[] y = new int[100];
        int[] z = new int[200];
        int m, n;
        System.out.print("Enter size of X: ");
        m = sc.nextInt();
        System.out.print("Enter descending elements of X: ");
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        System.out.print("Enter size of Y: ");
        n = sc.nextInt();
        System.out.print("Enter descending elements of Y: ");
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            z[i] = x[i];
        }
        for (int i = 0; i < n; i++) {
            z[m + i] = y[i];
        }
        int size = m + n;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (z[i] < z[j]) {
                    int temp = z[i];
                    z[i] = z[j];
                    z[j] = temp;
                }
            }
        }
        System.out.print("Merged array in descending order: ");
        for (int i = 0; i < size; i++) {
            System.out.print(z[i] + " ");
        }
    }
}