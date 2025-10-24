import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100], b = new int[100], c = new int[100];
        int n1, n2, n3;
        System.out.print("Enter size of first array: ");
        n1 = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();
        System.out.print("Enter size of second array: ");
        n2 = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();
        System.out.print("Enter size of third array: ");
        n3 = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n3; i++) c[i] = sc.nextInt();
        int i = 0, j = 0, k = 0, prev = Integer.MIN_VALUE;
        while (i < n1 && j < n2 && k < n3) {
            if (a[i] == b[j] && b[j] == c[k] && a[i] != prev) {
                System.out.print(a[i] + " ");
                prev = a[i];
                i++; j++; k++;
            } else if (a[i] < b[j]) i++;
            else if (b[j] < c[k]) j++;
            else k++;
        }
    }
}