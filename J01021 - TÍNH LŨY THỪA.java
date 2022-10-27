import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01021_Tichluythua {
    static long mod = 1000000007;
    public static long luy_thua(long a,long b)
    {
        if(b==0) return 1;
        if(b==1) return a%mod;
        long k = luy_thua(a, b/2)%mod;
        if(b%2!=0)
        {
            return (((k*k)%mod)*a)%mod;
        }
        else{
            return (k*k)%mod;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {            
            long a = scanner.nextLong(),b = scanner.nextLong();
            if(a==0 && b==0)
            {
                break;
            }
            long mod = 1000000007;
            System.out.println(luy_thua(a, b));
        }
    }
}