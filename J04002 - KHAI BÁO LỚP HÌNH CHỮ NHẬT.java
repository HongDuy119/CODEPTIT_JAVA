
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J04002 {
    static Scanner scanner = new Scanner(System.in);
    static class Rectange{
        private double width,height;
        private String color;
        public Rectange(){
        }

        public Rectange(double width, double height, String color) {
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        
        public void input(){
            width = scanner.nextDouble();
            height = scanner.nextDouble();
            color = new StringBuilder(scanner.next().toLowerCase()).toString();
        }
        public void output(){
            if(width<=0 || height<=0) System.out.println("INVALID");
            else
            {
                StringBuilder s = new StringBuilder(color);
                s.setCharAt(0, Character.toUpperCase(s.charAt(0)));
//                System.out.println(color);
                System.out.println((int)(width+height)*2 +" " + (int)(width*height) +" "+s);
                
            }
        }
    }
    public static void main(String[] args) {
        Rectange s = new Rectange();
        s.input();
        s.output();
    }
    
}
