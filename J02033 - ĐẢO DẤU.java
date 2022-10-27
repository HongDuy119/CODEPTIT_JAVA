
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long k = scanner.nextLong();
        long[] a = new long[1000005];
        for(int i = 0 ; i< m ; i++)
        {
            a[i] = scanner.nextLong();
        }
        Arrays.sort(a, 0, (int)m);
        int dem = 0;
        for(int i = 0 ; i< m ; i++)
        {
            if(dem==k) break;
            if(a[i]<0)
            {
                a[i] = -a[i];
                dem++;
            }
            else
            {
                Arrays.sort(a, 0, (int) m);
                break;
            }
        }
        k = k-dem;
        long sum = 0;
        for(int i = 1 ; i<m ; i++)
        {
            sum+= a[i];
        }
        if(k%2==0) sum+=a[0];
        else sum -= a[0];
        System.out.println(sum);
             
    }
    
}
