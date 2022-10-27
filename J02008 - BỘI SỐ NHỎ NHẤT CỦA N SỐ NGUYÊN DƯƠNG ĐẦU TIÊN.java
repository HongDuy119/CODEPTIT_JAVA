
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02008_BoisonhonhatcuaNsonguyenduongdautien {
    private static long gcd(long a, int b){
        if(b==0) return a;
        return gcd(b, (int) (a%b));
    }
    private static long bcd(long a,int b)
    {
        return (a*b)/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int j = 1 ; j<= test ; j++)
        {
            int n = scanner.nextInt();
            long res = 1;
            for(int i = 1 ; i<=n ; i++)
            {
                res = bcd(res, i);
            }
            System.out.println(res);
        }
    }
    
}
