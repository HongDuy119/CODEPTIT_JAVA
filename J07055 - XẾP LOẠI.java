
package code_ptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class BangDiem implements Comparable<BangDiem>{
    private String name,id;
    private double mark1,mark2,mark3;
    public BangDiem(int i){
        String tmp = String.valueOf(i);
        if(i<=10)
        {
            String tm =
            id = "SV0"+tmp;
        }
        else id = "SV"+tmp;
    }
    public void nhap(String name, double mark1, double mark2, double mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    private String chuanhoaten(){
        String res ="";
        String[] tmp = name.toLowerCase().trim().split("\\s+");
        for(String x : tmp)
        {
            StringBuilder j = new StringBuilder(x);
            j.setCharAt(0, Character.toUpperCase(x.charAt(0)));
            res = res + j +" ";
        }
        return res;
    }
    public void in(){
        String loai="";
        if(getDiem()>=8.0) loai ="GIOI";
        else if(getDiem()>=6.5) loai = "KHA";
        else if(getDiem()>=5.0) loai = "TRUNG BINH";
        else loai = "KEM";
        System.out.print(id + " "+chuanhoaten());
        System.out.printf("%.2f ",getDiem());
        System.out.println(loai);
    }
    
    public double getDiem(){
        double diem = mark1*0.25+mark2*0.35+mark3*0.4;
        return diem;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public double getMark3() {
        return mark3;
    }

    public void setMark3(double mark3) {
        this.mark3 = mark3;
    }

    @Override
    public int compareTo(BangDiem o) {
        return Double.compare(o.getDiem(), getDiem());
    }
    
}
public class Main {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(new File("BANGDIEM.in"));
       int test = Integer.parseInt(scanner.nextLine());
       List<BangDiem> duy = new ArrayList<>();
       for(int i = 1; i<=test ; i++)
       {
           BangDiem tmp = new BangDiem(i);
           tmp.nhap(scanner.nextLine(),Double.parseDouble(scanner.nextLine()),Double.parseDouble(scanner.nextLine()),Double.parseDouble(scanner.nextLine()));
          duy.add(tmp);
       }
       Collections.sort(duy);
       for(BangDiem x :duy)
       {
           x.in();
       }
    }
}
