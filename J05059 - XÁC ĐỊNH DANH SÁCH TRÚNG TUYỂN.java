
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
class Thisinh{
    private String id,name,loai;
    private double mark1,mark2,mark3,mark,uutien;

    public Thisinh(String id, String name, double mark1, double mark2, double mark3) {
        this.id = id;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        String tmp = id.substring(0, 3);
        if(tmp.compareTo("KV3")==0)
        {
            uutien = 2.5;
        }
        if(tmp.compareTo("KV2")==0)
        {
            uutien = 1;
        }
        if(tmp.compareTo("KV1")==0)
        {
            uutien = 0.5;
        }
        mark = mark1*2+mark2+mark3+uutien;
    }

    public String chuanhoaten() {
        String res = "";
        String[] tmp = name.toLowerCase().trim().split("\\s+");
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

    public double getUutien() {
        return uutien;
    }

    public void setUutien(double uutien) {
        this.uutien = uutien;
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
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        List<Thisinh> list = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0)
        {
            list.add(new Thisinh(sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine())));
        }
        list.sort(new Comparator<Thisinh>(){
            @Override
            public int compare(Thisinh o1, Thisinh o2) {
                return Double.compare(o2.getMark(), o1.getMark());
            }

        });
        int k = Integer.parseInt(sc.nextLine());
        int dem =0;
        double res = 0;
        for(Thisinh x : list)
        {
            dem++;
            if(dem==k)
            {
                res = x.getMark();
                break;
            }
        }
        System.out.println(res);
        for(Thisinh x : list)
        {
            if(x.getMark()>=res)
            {
                System.out.print(x.getId()+" "+x.chuanhoaten()+" ");
                if(x.getUutien()==1.0)
                {
                    System.out.print("1 ");
                }
                else
                    System.out.print(x.getUutien()+" ");
                if(x.getMark()==(int)x.getMark())
                {
                    System.out.println((int)x.getMark()+" TRUNG TUYEN");
                }
                else
                {
                    System.out.println(x.getMark()+" TRUNG TUYEN");
                }
            }
            else
            {
                System.out.print(x.getId()+" "+x.chuanhoaten()+" ");
                if(x.getUutien()==1.0)
                {
                    System.out.print("1 ");
                }
                else
                    System.out.print(x.getUutien()+" ");
                if(x.getMark()==(int)x.getMark())
                {
                    System.out.println((int)x.getMark()+" TRUOT");
                }
                else
                {
                    System.out.println(x.getMark()+" TRUOT");
                }
            }
        }
    }

}