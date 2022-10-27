
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J04005 {
    public static Scanner scanner = new Scanner(System.in);
    public static class Thi_sinh{
        public String name;
        public String date;
        public float mark1,mark2,mark3;
        public void nhap()
        {
            name = scanner.nextLine();
            date = scanner.nextLine();
            mark1 = scanner.nextFloat();
            mark2 = scanner.nextFloat();
            mark3 = scanner.nextFloat();
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
            System.out.print(name + " " +res +" ");
            System.out.printf("%.1f",mark1+mark2+mark3);
        }
    }
    public static void main(String[] args) {
        Thi_sinh s = new Thi_sinh();
        s.nhap();
        s.in();
    }
    
}
