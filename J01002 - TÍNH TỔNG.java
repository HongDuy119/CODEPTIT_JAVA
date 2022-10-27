
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01002_Tinhtong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test;
        test = scanner.nextInt();
        for(int i = 1 ; i <= test ; i++)
        {
            long n = scanner.nextLong();
            System.out.println((n+1)*n/2);
        }
    }
}
