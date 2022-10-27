
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n+1][n+1];
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n ; j++)
            {
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = i+1 ; j <= n ; j++)
            {
                if(a[i][j]==1)
                    System.out.printf("(%d,%d)\n",i,j);
            }
        }
    }
    
}
