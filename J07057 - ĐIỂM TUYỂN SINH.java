
package code_ptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class ThiSinh implements Comparable<ThiSinh>{
    private String name,id;
    private double mark1;
    private String dantoc;
    private int khuvuc;
    public ThiSinh(int i){
        String tmp = String.valueOf(i);
        if(i<=10)
        {
            String tm =
            id = "TS0"+tmp;
        }
        else id = "TS"+tmp;
    }

    public void nhap(String name, double mark1, String dantoc, int khuvuc) {
        this.name = name;
        this.mark1 = mark1;
        this.dantoc = dantoc;
        this.khuvuc = khuvuc;
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
    public double getDiem()
    {
        Double diem = mark1;
        if(dantoc.compareTo("Kinh")!=0)
        {
            diem+=1.5;
        }
        if(khuvuc==1)
        {
            diem += 1.5;
        }
        if(khuvuc==2)
            diem+=1;
        return diem;
    }
    
    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public String getDantoc() {
        return dantoc;
    }

    public void setDantoc(String dantoc) {
        this.dantoc = dantoc;
    }

    public int getKhuvuc() {
        return khuvuc;
    }

    public void setKhuvuc(int khuvuc) {
        this.khuvuc = khuvuc;
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
        if(getDiem()>=20.5) loai = "Do";
        else loai = "Truot";
        System.out.print(id+" "+chuanhoaten());
        System.out.printf("%.1f ",getDiem());
        System.out.println(loai);
    }
    
    
    @Override
    public int compareTo(ThiSinh o) {
        return Double.compare(o.getDiem(), getDiem());
    }
    
}
public class Main {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(new File("THISINH.in"));
       int test = Integer.parseInt(scanner.nextLine());
       List<ThiSinh> duy = new ArrayList<>();
       for(int i = 1; i<=test ; i++)
       {
           ThiSinh tmp = new ThiSinh(i);
           tmp.nhap(scanner.nextLine(),Double.parseDouble(scanner.nextLine()),scanner.nextLine(),Integer.parseInt(scanner.nextLine()));
          duy.add(tmp);
       }
       Collections.sort(duy);
       for(ThiSinh x :duy)
       {
           x.in();
       }
    }
}
