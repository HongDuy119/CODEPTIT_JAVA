
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02034_Bosungdayso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int[] a = new int[305] , b = new int[305];
        for(int j=1 ; j<=300 ; j++) b[j]=0;
        int maxn = -100;
        for(int i = 1 ; i<=test ; i++){
            a[i] = scanner.nextInt();
            maxn = Math.max(maxn, a[i]);
            b[a[i]]=1;
        }
        int kq= 0;
        for(int i = 1 ; i<=maxn ; i++)
        {
            if(b[i]==0)
            {
                System.out.println(i);
                kq=1;
            }
        }
        if(kq==0) System.out.println("Excellent!");
    }
    
}
