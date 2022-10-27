
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01011_Boisochung_Uocsochung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i=0 ; i< test ; i++)
        {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(BSCNN(a, b) + " " + USCLN(a, b));
        }
    }
    public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
     
    public static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }
    
}
