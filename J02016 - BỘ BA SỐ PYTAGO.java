
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
public class J02016 {
    public static boolean check(long a[] , int l ,int r , long x)
    {
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(a[mid]== x) return true;
            else if(a[mid]<x)
            {
                l = mid+1;
            }
            else r = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ; i<= test ; i++)
        {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for(int j = 0 ; j<n ; j++)
            {
                a[j] = scanner.nextLong();
                a[j] = a[j]*a[j];
            }
            Arrays.sort(a);
            int kq = 0;
            for(int j = 0 ;j<n-2 ; j++)
            {
                for(int k = j+1 ; k<n-1 ; k++)
                {
                    long x = a[j]+a[k];
                    if(check(a,k+1,n-1,x)) 
                    {
                        kq=1;
                        break;
                    }
                }
                if(kq==1) break;
            }
            if(kq==0) System.out.println("NO");
            else System.out.println("YES");
                
        }
    }
    
}

