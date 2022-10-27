/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Hong Duy
 */
public class Ideone {
    static Scanner scanner = new Scanner(System.in);
    public static class Sinh_Vien {

        private String name, clas, age;
        private double gpa;

        public Sinh_Vien() {

        }

        public void input() {
            name = scanner.nextLine();
            clas = scanner.nextLine();
            age = scanner.nextLine();
            gpa = Double.valueOf(scanner.nextLine());
        }

        public String getAge() {
            return age;
        }
        
        public void output() {
            String[] s = getAge().split("/");
            String res = "";
            if (s[0].length() == 1) {
                res = res + "0" + s[0] + "/";
            } else {
                res += s[0] + "/";
            }
            if (s[1].length() == 1) {
                res = res + "0" + s[1] + "/";
            } else {
                res += s[1] + "/";
            }
            res += s[2];
            System.out.print(this.name + " " + this.clas + " " + res + " ");
            System.out.printf("%.2f\n", gpa);
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes hereScanner scanner =Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= test; i++) {
            Sinh_Vien a = new Sinh_Vien();
            a.input();
            if (i < 10) {
                System.out.printf("B20DCCN00%d ", i);
            } else {
                System.out.printf("B20DCCN0%d ", i);
            }
            a.output();
        }
    }
}
