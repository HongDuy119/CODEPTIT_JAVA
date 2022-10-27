
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n+1][n+1];
        String[] string = new String[n+1];
        for(int i = 1 ; i <= n ; i++)
        {
            String res = "";
            for(int j = 1 ; j <= n ; j++)
            {
                a[i][j] = scanner.nextInt();
                if(a[i][j]==1)
                {
                   res = res + " "+String.valueOf(j);
                }
            }
            string[i] = res;
        }
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.printf("List(%d) = ",i);
            System.out.printf("%s\n",string[i]);
        }
    }
    
}
