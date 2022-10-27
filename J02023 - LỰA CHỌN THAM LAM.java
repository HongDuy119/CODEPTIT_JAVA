
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02023 {
    static Scanner scanner = new Scanner(System.in);
    public static void solve(){
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if(n*9<k || k==0)
        {
            System.out.println("-1 -1");
            return;
        }
        int[] a = new int[150];
        int[] b = new int[150];
        for(int i =0 ;i<=105 ; i++) b[i]=0;
        int k1 = k;
        for(int i =1 ; i<=n ; i++)
        {
            if(k>=9)
            {
                a[i] = 9;
                k -= 9;
            }
            else if(k>0) 
            {
                a[i]=k;
                k = 0;
            }
            else a[i]=0;
        }
        for(int i=n ; i>=1 ; i--)
        {
            if(k1>9)
            {
                b[i] = 9;
                k1-=9;
            }
            else if(k1<=9)
            {
                if(i==1){
                    b[i]=k1;
                }
                else{
                    b[i] = k1-1;
                    b[1] = 1;
                    k1=0;
                    break;
                }
            }
        }
        for(int i=1 ; i<=n  ;i++)
        {
            System.out.printf("%d",b[i]);
        }
        System.out.printf(" ");
        for(int i=1 ; i<=n  ;i++)
        {
            System.out.printf("%d",a[i]);
        }
    }
    public static void main(String[] args) {
        solve();
    }
}
