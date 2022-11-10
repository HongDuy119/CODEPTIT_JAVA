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
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ElectricityBill> bills = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            bills.add(new ElectricityBill(String.format("KH%02d", i), sc.nextLine(), sc.nextLine().trim().split("\\s+")));
        bills.sort((a, b) -> {
            return b.getTotalMoney()-a.getTotalMoney();
        });
        bills.forEach(System.out::println);
    }
}

class ElectricityBill {
    private String id;
    private String name;
    private int first, last;
    private String typeOfHousehold;

    public ElectricityBill(String id, String name, String[] list) {
        this.id = id;
        setName(name);
        this.typeOfHousehold = list[0];
        this.first = Integer.parseInt(list[1]);
        this.last = Integer.parseInt(list[2]);
    }

    public ElectricityBill() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String[] list = name.trim().split("\\s+");
        for (int i = 0; i < list.length; i++)
            list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1).toLowerCase();
        this.name = String.join(" ", list);
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public String getTypeOfHousehold() {
        return typeOfHousehold;
    }

    public void setTypeOfHousehold(String typeOfHousehold) {
        this.typeOfHousehold = typeOfHousehold;
    }
    
    private int getNorm() {
        switch(typeOfHousehold) {
            case "A":
                return 100;
            case "B":
                return 500;
            default:
                return 200;
        }
    }
    
    private int getMoneyInNorm() {
        int norm = getNorm();
        int electricNumber = last-first;
        if (electricNumber <= norm) return electricNumber*450;
        return norm*450;
    }
    
    private int getMoneyOutNorm() {
        int norm = getNorm();
        int electricNumber = last-first;
        if (electricNumber <= norm) return 0;
        return (electricNumber-norm)*1000;
    }
    
    public int getTotalMoney() {
        return (int) (getMoneyInNorm() + getMoneyOutNorm()*1.05);
    }
    
    private int getVAT() {
        return (int) (getMoneyOutNorm()*0.05);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getMoneyInNorm() + " " + getMoneyOutNorm() + " " + getVAT() + " " + getTotalMoney();
    }
}
