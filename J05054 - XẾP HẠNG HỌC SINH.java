
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

class Xephang {

    private String name, id,loai;
    private double mark;
    private int tt;

    public Xephang(int id, String name, double mark) {
        this.name = name;
        this.id = String.format("HS%02d", id);
        this.mark = mark;
        if(this.mark>=9.0) loai = "Gioi";
        else if(this.mark>=7.0) loai = "Kha";
        else if(this.mark>=5.0) loai = "Trung Binh";
        else loai = "Yeu";
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
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
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", mark)+" "+loai+" "+tt;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Xephang> list = new ArrayList<>();
        List<Xephang> list1 = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= test; i++) {
            list.add(new Xephang(i,sc.nextLine(),Double.valueOf(sc.nextLine())));
        }
        for (int i = 1; i <= test; i++) {
            list1.add(list.get(i-1));
        }
        
        list.sort(new Comparator<Xephang>(){
            @Override
            public int compare(Xephang o1, Xephang o2) {
                return Double.compare(o1.getMark(), o2.getMark());
            }
            
        });
        list.get(test-1).setTt(1);
        int tmp =1;
        for(int i =test-2 ; i>=0 ; i--)
        {
            if(list.get(i).getMark()==list.get(i+1).getMark())
            {
                list.get(i).setTt(tmp);
                
            }
            else
            {
                list.get(i).setTt(test-i);
            }
            tmp = list.get(i).getTt();
        }
        for(Xephang x: list1)
        {
            System.out.println(x);
        }
    }

}
