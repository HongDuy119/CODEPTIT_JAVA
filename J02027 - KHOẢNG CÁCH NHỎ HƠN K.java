
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
public class J02027 {
    public static int binary(int[] a,int l,int r ,int x)
    {
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(a[mid]>=x)
                r= mid-1;
            if(a[mid]<x)
                l = mid+1;
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test>0)
        {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i<n ; i++)
            {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a, 0, n);
            long res = 0;
            for(int i = 0 ; i<n ; i++)
            {
                int x = a[i]+k;
                int index = binary(a, i+1, n-1, x);
                res = res + (index-i-1);
            }
            System.out.println(res);
            test--;
        }
    }
    
    
}
