
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01022 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long a[] = new long[100];
        a[0]=0;
        a[1]=1;
        for(int i =2 ; i <= 92 ; i++)
        {
            a[i] = a[i-1] + a[i-2];
        }
        int test = scanner.nextInt();
        while(test-->0)
        {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            while(n>2)
            {
                if(k>a[n-2])
                {
                    k -= a[n-2];
                    n = n-1;
                }
                else
                {
                    n -= 2;
                }
            }
            if(n==1) System.out.println("0");
            else System.out.println("1");
        }
    }
    
}
