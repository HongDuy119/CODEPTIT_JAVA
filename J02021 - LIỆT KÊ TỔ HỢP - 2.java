
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02021 {
    static int n,k,dem=0;
    static int[] a = new int[1005];
    public static void In()
    {
        dem++;
        for(int i=1 ; i<=k ; i++)
        {
            System.out.printf("%d",a[i]);
        }
        System.out.printf(" ");
    }
    public static void Try(int j)
    {
//        System.out.println(a[n-1]+1);
        for(int i=a[j-1]+1; i<=n-k+j ; i++)
        {
//            System.out.println("1");
            a[j] = i;
            if(j==k) In();
            else Try(j+1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i= 0 ;i<=k ;i++) a[i]=0;
        n = scanner.nextInt();
        k = scanner.nextInt();
        Try(1);
        System.out.printf("\nTong cong co %d to hop",dem);
    }
    
}
