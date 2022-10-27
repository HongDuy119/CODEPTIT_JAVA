import java.util.Scanner;
public class J02103 {

    static Scanner scanner = new Scanner(System.in);

    public static void solve(int[][] c, int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                int sum = 0;
                for (int h = 1; h <= b; h++) {
                    sum = sum + c[i][h] * c[j][h];
                }
                System.out.print(sum + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int test = Integer.parseInt(scanner.next());
        for (int i = 1; i <= test; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] a = new int[n+5][m+5];
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    a[j][k] = Integer.parseInt(scanner.next());
                }
            }
            System.out.printf("Test %d:\n", i);
            solve(a, n, m);
        }

    }
}