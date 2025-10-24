import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100], pos = new int[100], neg = new int[100], res = new int[100];
        int n, p = 0, q = 0, r = 0;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 0) pos[p++] = arr[i];
            else neg[q++] = arr[i];
        }
        int i = 0, j = 0;
        while (i < p && j < q) {
            res[r++] = pos[i++];
            res[r++] = neg[j++];
        }
        while (i < p) res[r++] = pos[i++];
        while (j < q) res[r++] = neg[j++];
        for (int k = 0; k < r; k++)
        {
            System.out.print(res[k] + " ");
        } 
    }
}