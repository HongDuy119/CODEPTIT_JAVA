
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Hong Duy
 */
public class J01025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        int k1 = Math.min(x1, x3);
        int k2 = Math.max(x2, x4);
        int k3 = Math.min(y1, y3);
        int k4 = Math.max(y2, y4);
        System.out.println(Math.max(k2-k1, k4-k3)*Math.max(k2-k1, k4-k3));

    }

}
