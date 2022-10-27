
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J04015 {
    static Scanner scanner = new Scanner(System.in);
    public static class Giao_vien{
        String id,name;
        long income;
        public void nhap(){
            id = scanner.nextLine();
            name = scanner.nextLine();
            income = scanner.nextLong();
        }
        public void in(){
            long bac_luong = 10*(Integer.valueOf(id.charAt(2))-48)+(Integer.valueOf(id.charAt(3))-48);
//            System.out.println(Integer.valueOf(id.charAt(2)));
            long phu_cap=0;
            if(id.charAt(1)=='T')
            {
                phu_cap = 2000000;
            }
            if(id.charAt(1)=='P')
            {
                phu_cap = 900000;
            }
            if(id.charAt(1)=='V')
            {
                phu_cap = 500000;
            }
            System.out.println(id + " " + name +" "+bac_luong + " " + phu_cap +" " +(income*bac_luong+phu_cap));
            
        }
    }
    public static void main(String[] args) {
        Giao_vien m = new Giao_vien();
        m.nhap();
        m.in();
        
    }
}
