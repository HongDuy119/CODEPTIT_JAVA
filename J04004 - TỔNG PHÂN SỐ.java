
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J04004 {
    public static long GCD(long a, long b)
    {
        if(b==0) return a;
        return GCD(b, a%b);
    }
    public static long BCD(long a, long b)
    {
        return (a*b)/GCD(a, b);
    }
    public static void main(String[] args) {
        long tu1,mau1,tu2,mau2;
        Scanner scanner = new Scanner(System.in);
        tu1 = scanner.nextLong();
        mau1 = scanner.nextLong();
        tu2 = scanner.nextLong();
        mau2 = scanner.nextLong();
        tu1 = tu1*mau2+tu2*mau1;
        mau1 = mau1*mau2;
        long gccd = GCD(tu1, mau1);
        System.out.println(tu1/gccd +"/" + mau1/gccd);
    }
    
}
