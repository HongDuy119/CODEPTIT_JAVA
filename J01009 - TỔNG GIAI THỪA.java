
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01009_Tonggiaithua {
    public static long giaithua(long n)
    {
        if(n==1 || n==0) return 1;
        return n*giaithua(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum = 0;
        for(int i=1 ; i<=n ; i++)
        {
            sum += giaithua(i);
        }
        System.out.println(sum);
    }
}
