
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01005_Chiatamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ; i<=test ; i++)
        {
            int n = scanner.nextInt();
            int h = scanner.nextInt();
            for(int j = 1 ; j < n ; j++)
            {
                double res = h*Math.sqrt((double)j/n);
                System.out.printf("%.6f ",res);
            }
            System.out.println("");
        }
    }
    
}
