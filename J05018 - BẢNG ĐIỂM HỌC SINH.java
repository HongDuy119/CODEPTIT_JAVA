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
class Bangdiem{
    private String name,id,loai;
    
    private double mark;

    public Bangdiem(int id, String name, String tmp) {
        this.id = String.format("HS%02d", id);
        this.name = name;
        String[] tm = tmp.trim().split("\\s+");
        this.mark = (Double.valueOf(tm[0])+Double.valueOf(tm[1]))*2;
        for(int i =2;i<10;i++)
        {
            this.mark += Double.valueOf(tm[i]);
        }
        this.mark = this.mark/12;
        this.mark = Math.round(this.mark*10.0)/10.0;
        if(this.mark>=9.0) loai = "XUAT SAC";
        else if(this.mark>=8.0) loai = "GIOI";
        else if(this.mark>=7.0) loai = "KHA";
        else if(this.mark>=5.0) loai = "TB";
        else loai = "YEU";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return id+" "+name +" "+String.format("%.1f", mark)+" "+loai;
    }
    
    
    
}
public class Main{
    public static void main(String[] args) {
        List<Bangdiem> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= test ; i++)
        {
            list.add(new Bangdiem(i,sc.nextLine(),sc.nextLine()));
        }
        list.sort(new Comparator<Bangdiem>(){
            @Override
            public int compare(Bangdiem o1, Bangdiem o2) {
                if(Double.compare(o2.getMark(), o1.getMark())==0)
                {
                    return o1.getId().compareTo(o2.getId());
                }
                else return Double.compare(o2.getMark(), o1.getMark());
            }
            
        });
        for(Bangdiem x : list)
        {
            System.out.println(x);
        }
    }
    
}