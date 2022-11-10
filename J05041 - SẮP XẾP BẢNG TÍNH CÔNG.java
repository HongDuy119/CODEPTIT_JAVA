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
class Tinhcong{
    private String name,id;
    private int luong,songay,salary,thuong,phucap;
    private String chucvu;

    public Tinhcong(int id,String name, int luong, int songay, String chucvu) {
        this.id = String.format("NV%02d", id);
        this.name = name;
        this.luong = luong;
        this.songay = songay;
        this.chucvu = chucvu;
        this.salary = songay*luong;
        if(this.songay>=25) this.thuong = (int) (this.salary*0.20);
        else if(this.songay>=22) this.thuong = (int) (this.salary*0.1);
        else this.thuong = 0;
        if(this.chucvu.equals("GD")) this.phucap = 250000;
        if(this.chucvu.equals("PGD")) this.phucap = 200000;
        if(this.chucvu.equals("TP")) this.phucap = 180000;
        if(this.chucvu.equals("NV")) this.phucap = 150000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    @Override
    public String toString() {
        return id +" "+name +" "+salary +" "+thuong+" "+phucap +" "+(salary+thuong+phucap);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public int getPhucap() {
        return phucap;
    }

    public void setPhucap(int phucap) {
        this.phucap = phucap;
    }
    
    
    
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        List<Tinhcong> list = new ArrayList<>();
        for(int i = 1; i <= test ; i++)
        {
            list.add(new Tinhcong(i,sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine()));
        }
        list.sort(new Comparator<Tinhcong>(){
            @Override
            public int compare(Tinhcong o1, Tinhcong o2) {
                return (o2.getSalary()+o2.getPhucap()+o2.getThuong())-(o1.getSalary()+o1.getPhucap()+o1.getThuong());
            }
            
        });
        for(Tinhcong x : list )
        {
            System.out.println(x);
        }
    }
}