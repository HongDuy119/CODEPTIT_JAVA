
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02028 {
    public static boolean find(long a[],int l,int r,long x)
    {
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(a[mid]==x) return true;
            else if(a[mid]>x)
            {
                r = mid-1;
            }
            else l = mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-->0)
        {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            long[] a = new long[100005];
            a[0] =0;
            for(int i = 1 ; i<= n ; i++)
            {
                a[i] = a[i-1]+scanner.nextLong();
            }
            for(int i=0 ; i<=n ; i++)
            {
                long x = a[i]+k;
                if(find(a,i+1,n,x))
                {
                    System.out.println("YES");
                    break;
                }
                if(i==n)
                {
                    System.out.println("NO");
                }
            }
        }
        
    }
    
}
