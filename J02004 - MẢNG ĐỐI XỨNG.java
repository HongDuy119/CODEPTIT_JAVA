
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02004_Mangdoixung {
    public static boolean mang_doi_xung(int[] a,int n)
    {
        for(int i=0 ; i<=n/2 ; i++)
        {
            if(a[i] != a[n-1-i])
            {
//                System.out.println(a[i]+" "+a[n-i-1]);
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 0 ; i<test ; i++)
        {
            int n = scanner.nextInt();
            int[] a;
            a = new int[n+5];
            for(int j = 0 ; j<n ; j++)
            {
                a[j] = scanner.nextInt();
            }
            if(mang_doi_xung(a, n)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
    
}
