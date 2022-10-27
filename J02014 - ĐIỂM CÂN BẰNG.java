
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02014_Diemcanbang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ; i <= test ; i++)
        {
            int n = scanner.nextInt();
            int[] a = new int[n+5];
            long sum = 0,res=0;
            for(int j = 0 ; j< n ; j++)
            {
                a[j] = scanner.nextInt();
                sum += a[j];
            }
            for(int j = 0 ; j<n-1 ; j++)
            {
                res += a[j];
                if(res == sum-res-a[j+1])
                {
                    System.out.println(j+2);
                    break;
                }
                if(j==n-2) System.out.println("-1");
            }
        }
    }
    
}
