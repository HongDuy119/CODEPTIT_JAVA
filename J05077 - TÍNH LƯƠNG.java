
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

class Phongban{
    private String ten;

    public Phongban(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        String[] tmp = ten.trim().split("\\s+");
        String duy = "";
        for(int i =1 ; i<tmp.length;i++)
        {
            duy += tmp[i]+" ";
        }
        return duy.substring(0,duy.length());
    }
    public String getMa() {
        String[] tmp = ten.trim().split("\\s+");
        return tmp[0];
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
class QlNV{
    private String ma,ten;
    private int luong,songaycong;

    public QlNV(String ma, String ten, int luong, int songaycong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
        this.songaycong = songaycong;
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

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getSongaycong() {
        return songaycong;
    }

    public void setSongaycong(int songaycong) {
        this.songaycong = songaycong;
    }
}
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("src/DATA.in"));
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        List<Phongban> list = new ArrayList<>();
        List<QlNV> list1 = new ArrayList<>();
        for(int i = 1 ; i<= test ; i++)
        {
            list.add(new Phongban(sc.nextLine()));
        }
        int a[] = {10,10,10,12,12,12,12,12,14,14,14,14,14,14,14,20};
        int b[] = {10,10,10,11,11,11,11,11,13,13,13,13,13,13,13,16};
        int c[] = {9,9,9,10,10,10,10,10,12,12,12,12,12,12,12,14};
        int d[] = {8,8,8,9,9,9,9,9,11,11,11,11,11,11,11,13};
        int test1 = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=test1 ; i++)
        {
            list1.add(new QlNV(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        for(QlNV x : list1)
        {
            int nam =0;
            for(int j = 1;j<=2;j++)
            {
                nam = nam*10+ Integer.parseInt(String.valueOf(x.getMa().charAt(j)));
            }
            System.out.print(x.getMa()+" "+x.getTen()+" ");
            String s = x.getMa().substring(3);
            for(Phongban tmp : list)
            {
                if(tmp.getMa().compareTo(s)==0)
                {
                    System.out.print(tmp.getTen()+" ");
                }
            }
            char k1 = x.getMa().charAt(0);
            if(k1=='A')
            {
                if(nam>=16)
                {
                    System.out.println(a[15]*x.getLuong()*x.getSongaycong()*1000);
                }
                else
                    System.out.println(a[nam-1]*x.getLuong()*x.getSongaycong()*1000);
            }
            if(k1=='B')
            {
                if(nam>=16)
                {
                    System.out.println(b[15]*x.getLuong()*x.getSongaycong()*1000);
                }
                else
                    System.out.println(b[nam-1]*x.getLuong()*x.getSongaycong()*1000);
            }
            if(k1=='C')
            {
                if(nam>=16)
                {
                    System.out.println(c[15]*x.getLuong()*x.getSongaycong()*1000);
                }
                else
                    System.out.println(c[nam-1]*x.getLuong()*x.getSongaycong()*1000);
            }
//            System.out.println(k1);
            if(k1=='D')
            {
//                System.out.println(x.getLuong()+" "+x.getSongaycong());
                if(nam>=16)
                {
                    System.out.println(d[15]*x.getLuong()*x.getSongaycong()*1000);
                }
                else
                    System.out.println(d[nam-1]*x.getLuong()*x.getSongaycong()*1000);
            }
        }
    }
}