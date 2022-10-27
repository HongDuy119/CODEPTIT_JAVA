
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01006_TinhsoFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        long[] a;
        a = new long[100];
        a[1]=1;a[2]=1;
        for(int i=3 ; i<=92 ; i++)
        {
            a[i] = a[i-1]+a[i-2];
        }
        for(int i=1 ; i<= test ; i++)
        {
            int n = scanner.nextInt();
            System.out.println(a[n]);
        }
    }
    
}
