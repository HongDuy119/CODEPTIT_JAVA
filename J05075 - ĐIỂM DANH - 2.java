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
class Diemdanh{
    private String ma,ten,lop,loai;
    private int diem;

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
    public Diemdanh(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop +" "+diem+" "+loai;
    }
    
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        List<Diemdanh> list = new ArrayList<>();
        for(int i = 1 ; i<=test ; i++)
        {
            list.add(new Diemdanh(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        for(int i = 1 ; i<=test ; i++)
        {
            String[] s = sc.nextLine().trim().split("\\s+");
            Diemdanh tmp = null;
            for(Diemdanh x:list)
            {
                if(x.getMa().equals(s[0]))
                {
                    tmp = x;
                }
            }
            int dem1 = 0, dem2 = 0;
            for (int j = 0; j < s[1].length(); j++) {
                if(s[1].charAt(j) == 'm')
                    dem1++;
                else if(s[1].charAt(j) == 'v')
                    dem2++;
            }
            int diem = 10-dem1-dem2*2;
            if(diem <= 0)
                diem = 0;
            tmp.setDiem(diem);
            if(diem==0) tmp.setLoai("KDDK");
            else tmp.setLoai("");
        }
        String res = sc.nextLine();
        for(Diemdanh x : list)
        {
            if(x.getLop().equals(res)) System.out.println(x);
        }
        
    }
}