
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

class Tuyensinh{
    private String id,nameString,loai;
    private double mark1,mark2,mark3,mark,ut;
    private int tt;
    
    public Tuyensinh(int tt,String id, String nameString, double mark1, double mark2, double mark3) {
        this.tt=tt;
        this.id = id;
        this.nameString = nameString;
        this.nameString = chuanhoaten();
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark = mark1*2+mark2+mark3;
        if(id.charAt(2)=='1') ut = 0.5;
        if(id.charAt(2)=='2') ut=1.0;
        if(id.charAt(2)=='3') ut = 2.5;
        mark+=ut;
        if(mark>=24.0) loai = "TRUNG TUYEN";
        else loai = "TRUOT";
    }
    public String chuanhoaten() {
        String res = "";
        String[] tmp = nameString.toLowerCase().trim().split("\\s+");
        for (String x : tmp) {
            StringBuilder j = new StringBuilder(x);
            j.setCharAt(0, Character.toUpperCase(x.charAt(0)));
            res = res + j + " ";
        }
        res = res.substring(0, res.length()-1);
        return res;
    }
    public String getId() {
        return id;
    }
    public double getMark() {
        return mark;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getUt() {
        return ut;
    }

    public void setUt(double ut) {
        this.ut = ut;
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
    public String toString() {
        if(ut==1.0)
        {
            if((int)mark==mark)
            {
                return id+" "+nameString+" "+(int)ut+" "+(int)mark+" "+loai;
            }
            else return id+" "+nameString+" "+(int)ut+" "+mark+" "+loai;
        }
        else
        {
            if((int)mark==mark)
            {
                return id+" "+nameString+" "+ut+" "+(int)mark+" "+loai;
            }
            else return id+" "+nameString+" "+ut+" "+String.format("%.1f",mark)+" "+loai;
        }
    }
    
}
public class Main{
    public static void main(String[] args) {
        List<Tuyensinh> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for(int i =1 ; i<= test ; i++)
        {
            list.add(new Tuyensinh(i,sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine())));
        }
        list.sort(new Comparator<Tuyensinh>(){

            @Override
            public int compare(Tuyensinh o1, Tuyensinh o2) {
                if(o1.getMark()==o2.getMark()) 
                    return o1.getTt()-o2.getTt();
                else
                    return Double.compare(o2.getMark(),o1.getMark());
            }
          
        });
        for(Tuyensinh x : list)
        {
            System.out.println(x);
        }
    }
}