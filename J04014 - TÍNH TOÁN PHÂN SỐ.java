
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J04014 {
    static Scanner scanner = new Scanner(System.in);
    static class Phan_So{
        private long x1,y1,x2,y2;
        public Phan_So(){
        }
        public void input()
        {
            x1 = scanner.nextLong();
            y1 = scanner.nextLong();
            x2 = scanner.nextLong();
            y2 = scanner.nextLong();
        }
        public void output(){
            long tu = x1*y2+x2*y1;
            long mau = y1*y2;
            tu = tu*tu;
            mau = mau*mau;
            long gcd =  Long.parseLong(new BigInteger(String.valueOf(tu)).gcd(new BigInteger(String.valueOf(mau))).toString());
            tu = tu/gcd;
            mau = mau/gcd;
            System.out.print(tu+"/"+mau+" ");
            tu = tu*x1*x2;
            mau = mau*y1*y2;
            gcd = Integer.parseUnsignedInt(new BigInteger(String.valueOf(tu)).gcd(new BigInteger(String.valueOf(mau))).toString());
            tu = tu/gcd;
            mau = mau/gcd;
            System.out.print(tu+"/"+mau+" ");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int test = scanner.nextInt();
        while(test-->0)
        {
            Phan_So a = new Phan_So();
            a.input();
            a.output();
        }
    }
    
}
