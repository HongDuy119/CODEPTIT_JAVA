
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J04003 {
    public static long GCD(long a, long b) {
        if (b==0) return a;
        return GCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = GCD(a, b);
        System.out.print(a/c);
        System.out.print("/");
        System.out.println(b/c);
    }
    
}
