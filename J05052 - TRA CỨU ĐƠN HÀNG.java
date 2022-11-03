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
class Donhang{
    private String name,ma,sothutudonhang;
    private int dongia,soluong,giamgia,thanhtien;

    public Donhang(String name, String ma, int dongia, int soluong) {
        this.name = name;
        this.ma = ma;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getSothutudonhang() {
        return this.ma.substring(1, 4);
    }

    public void setSothutudonhang(String sothutudonhang) {
        this.sothutudonhang = sothutudonhang;
    }

    public int getGiamgia() {
        int tmp = Integer.parseInt(String.valueOf(this.ma.charAt(ma.length()-1)));
        if(tmp==1) return (int) (dongia*soluong*0.5);
        else{
            return (int) (dongia*soluong*0.3);
        }
    }

    public void setGiamgia(int giamgia) {
        this.giamgia = giamgia;
    }

    public int getThanhtien() {
        return dongia*soluong-getGiamgia();
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }

    @Override
    public String toString() {
        return name+" "+ma+" "+getSothutudonhang()+" "+getGiamgia()+" "+getThanhtien();
    }
    
}
public class Main{
    public static void main(String[] args) {
        List<Donhang> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0)
        {
            list.add(new Donhang(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()) ));
        }
        for(Donhang x : list)
        {
            System.out.println(x);
        }
    }
}