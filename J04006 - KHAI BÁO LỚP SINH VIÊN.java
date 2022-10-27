
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J04006 {
    public static Scanner scanner = new Scanner(System.in);
    public static class Sinh_vien{
        public String name;
        public String id;
        public String date;
        public float GPA;
        public void nhap()
        {
            name = scanner.nextLine();
            id = scanner.nextLine();
            date = scanner.nextLine();
            GPA = scanner.nextFloat();
        }
        public void in()
        {
            String res = "";
            String[] s = date.split("/");
            for(String x : s)
            {
                if(x.length()==1)
                {
                    res = res +'0'+x;
                }
                else
                    res = res + x;
                if(x.length()<3) res += '/';
            }
            System.out.print("B20DCCN001 ");
            System.out.print(name +" "+ id + " " +res +" ");
            System.out.printf("%.2f",GPA);
        }
    }
    public static void main(String[] args) {
        Sinh_vien m = new Sinh_vien();
        m.nhap();
        m.in();
        
    }
    
}
