
import java.io.File;
import java.util.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class IOFile {

    public <T> List<T> doc(String fname) {
        List<T> list = new ArrayList<>();
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
            list = (List<T>) o.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
class Giaovien{
    private String ten,ma,id,loai,mon;
    private double mark1,mark2,mark;

    public Giaovien(int id,String ten, String ma, double mark1, double mark2) {
        this.id = String.format("GV%02d",id);
        this.ten = ten;
        this.ma = ma;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark = mark1*2+mark2;
        if(ma.charAt(1)=='1') mark+=2;
        if(ma.charAt(1)=='2') mark+=1.5;
        if(ma.charAt(1)=='3') mark+=1;
        if(ma.charAt(1)=='4') mark+=0;
        if(ma.charAt(0)=='A') mon = "TOAN";
        if(ma.charAt(0)=='B') mon = "LY";
        if(ma.charAt(0)=='C') mon = "HOA";
        if(mark>=18.0) loai = "TRUNG TUYEN";
        else loai = "LOAI";
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return id +" "+ten +" "+mon +" "+mark +" "+loai;
    }
}
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new File("src/DATA.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<Giaovien> list = new ArrayList<>();
        for(int i = 1 ; i<= test ; i++)
        {
            list.add(new Giaovien(i,sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine())));
        }
        list.sort(new Comparator<Giaovien>() {
            @Override
            public int compare(Giaovien o1, Giaovien o2) {
                return Double.compare(o2.getMark(),o1.getMark());
            }
        });
        for(Giaovien x : list)
        {
            System.out.println(x);
        }
    }
}