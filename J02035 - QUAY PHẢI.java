
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ; i<= test ; i++)
        {
            int n = scanner.nextInt();
            int[] a = new int[n+5];
            for(int j = 0 ; j< n ; j++)
            {
                a[j] = scanner.nextInt();
            }
            int res = 0;
            for(int j = 0 ; j<n-1 ; j++)
            {
                if(a[j]>a[j+1])
                {
                    res = j+1;
                }
            }
            System.out.println(res);
        }
    }
}
