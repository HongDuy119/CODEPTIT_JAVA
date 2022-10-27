
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n+1][4];
        for(int i = 1 ; i <= n ; i++)
            for(int j = 1 ; j <= 3 ; j++)
                a[i][j] = scanner.nextInt();
        int res = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            int dem = 0;
            for(int j = 1 ; j <= 3 ; j++)
            {
                if(a[i][j]==1)
                {
                    dem++;
                }
            }
            if(dem>=2) res++;
        }
        System.out.println(res);
    }
    
}
