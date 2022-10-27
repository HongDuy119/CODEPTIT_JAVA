import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01007_KiemtrasoFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        long[] a;
        a = new long[100];
        a[0]=0;
        a[1]=1;
        a[2]=1;
        for(int i=3 ; i<=92 ; i++)
        {
            a[i] = a[i-1]+a[i-2];
        }
        for(int i=1 ; i<= test ; i++)
        {
            long n = scanner.nextLong();
            for(int j = 0 ; j<=92 ; j++)
            {
                if(n==a[j])
                {
                    System.out.println("YES");
                    break;
                }
                if(j==92) System.out.println("NO");
            }
        }
    }
    
}