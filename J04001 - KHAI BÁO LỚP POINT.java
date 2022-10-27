
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J04001 {
    static Scanner scanner = new Scanner(System.in);
    private static class Point{
        private double x1,y1,x2,y2;
        public void input(){
            x1 = scanner.nextDouble();
            y1 = scanner.nextDouble();
            x2 = scanner.nextDouble();
            y2 = scanner.nextDouble();
        }
        public void output(){
            double res = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
            System.out.printf("%.4f\n",res);
        } 
    }
    public static void main(String[] args) {
        int test = scanner.nextInt();
        while(test-->0)
        {
            Point a = new Point();
            a.input();
            a.output();
        }
    }
}
