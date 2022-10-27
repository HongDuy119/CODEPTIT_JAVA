
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01026_Sochinhphuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i=1 ; i<= test ; i++)
        {
            int n = scanner.nextInt();
            int k = (int) Math.sqrt(n);
            if(k*k == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
