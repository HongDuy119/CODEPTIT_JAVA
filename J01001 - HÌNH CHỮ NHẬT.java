
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01001_Hinhchunhat {
    public static void main(String[] args) {
        long a,b;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextLong();b=scanner.nextLong();
        if(a<=0 || b<=0)
            System.out.println("0");
        else
            System.out.println((a+b)*2 + " " +  a*b);
    }
}
