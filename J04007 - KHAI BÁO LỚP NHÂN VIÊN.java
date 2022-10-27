
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J04007 {
    public static Scanner scanner = new Scanner(System.in);
    public static class Nhan_vien{
        public String name;
        public String sex;
        public String date;
        public String address;
        public String id;
        public String start;
        public void nhap()
        {
            name = scanner.nextLine();
            sex = scanner.nextLine();
            date = scanner.nextLine();
            address = scanner.nextLine();
            id = scanner.nextLine();
            start = scanner.nextLine();
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
            System.out.print("00001 " +name +" "+sex+" "+res +" "+address+" "+id+" ");
            res = "";
            s = start.split("/");
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
            System.out.println(res);
        }
    }
    public static void main(String[] args) {
        Nhan_vien m = new Nhan_vien();
        m.nhap();
        m.in();
        
    }
    
}
