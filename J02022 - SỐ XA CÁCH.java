

import java.util.Scanner;

public class J02022 {

    public static int n;
    public static int a[] = new int[11], v[] = new int[11];

    public static void Try(int i) {
        if (i > n) {
            for (int k = 1; k <= n; k++) {
                System.out.print(a[k]);
            }
            System.out.println();
        } else {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || (Math.abs(a[i - 1] - j) != 1 && v[j] == 0)) {
                    a[i] = j;
                    v[j] = 1;
                    Try(i + 1);
                    v[j] = 0;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                v[i] = 0;
            }
            Try(1);
        }
    }
}
