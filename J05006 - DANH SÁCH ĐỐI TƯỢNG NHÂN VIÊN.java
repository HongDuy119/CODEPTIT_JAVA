package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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

class Sinhvien {

    private String name, gr, date, id;
    private double gpa;

    public void trueDate() {
        String s = this.date;
        if (s.charAt(1) == '/') {
            s = "0" + s;
        }
        if (s.charAt(4) == '/') {
            s = s.substring(0, 3) + "0" + s.substring(3, s.length());
        }
        this.date = s;
    }

    public String chuanhoaten() {
        String res = "";
        String[] tmp = name.toLowerCase().trim().split("\\s+");
        for (String x : tmp) {
            StringBuilder j = new StringBuilder(x);
            j.setCharAt(0, Character.toUpperCase(x.charAt(0)));
            res = res + j + " ";
        }
        res = res.substring(0, res.length() - 1);
        return res;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Sinhvien(String id, String name, String gr, String date, double gpa) {
        this.name = name;
        this.name = this.chuanhoaten();
        this.gr = gr;
        this.date = date;
        this.gpa = gpa;
        this.trueDate();
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NV> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new NV(String.format("%05d", i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        for(NV i : list)
            System.out.println(i);
    }
}

class NV{
    private String id;
    private String name;
    private String sex;
    private String birth;
    private String dc;
    private String fax;
    private String date;

    public NV() {
    }

    public NV(String id, String name, String sex, String birth, String dc, String fax, String date) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
        this.dc = dc;
        this.fax = fax;
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + birth + " " + dc + " " + fax + " " + date;   
    }
}