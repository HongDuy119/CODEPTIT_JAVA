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
public class Main {

    public static class XangDau implements Comparable<XangDau> {

        private String ma, hangSX;
        private long soLuong, donGia,thue, thanhTien;

        public XangDau(String ma, long soLuong) {
            this.ma = ma;
            this.soLuong = soLuong;
            this.hangSX = tinhHangSX(ma);
            this.donGia = tinhDonGia(ma);
            this.thue = tinhThue(ma, donGia, soLuong);
            this.thanhTien = donGia*soLuong+thue;
            
        }

        private long tinhDonGia(String ma){
            char x = ma.charAt(0);
            if(x == 'X')
                return 128000;
            else if(x == 'D')
                return 11200;
            else 
                return 9700;
        }
        
        private long tinhThue(String ma, long donGia, long soLuong){
            char x = ma.charAt(0);
            String s = "";
            for(int i = 3; i <= 4; i++)
                s +=ma.charAt(i);
            if(s.equals("TN"))
                return 0;
            if(x == 'X')
                return Math.round(donGia*soLuong*0.03);
            else if(x == 'D')
                return Math.round(donGia*soLuong*0.035);
            else 
                return Math.round(donGia*soLuong*0.02);
        }
        private String tinhHangSX(String ma){
            String s = "";
            for(int i = 3; i <= 4; i++)
                s +=ma.charAt(i);
            if(s.equals("BP"))
                return "British Petro";
            else if(s.equals("ES"))
                return "Esso";
            else if(s.equals("SH"))
                return "Shell";
            else if(s.equals("CA"))
                return "Castrol";
            else if(s.equals("MO"))
                return "Mobil";
            else 
                return "Trong Nuoc";
        }
        
        private long tinhThanhTien(long soM3){
            if(soM3 <= 50)
                return Math.round((100*soM3)*1.02);
            else if(soM3 <=100)
                return Math.round(((100*50)+((soM3-50)*150))*1.03);
            else 
                return Math.round(((100*50)+(50*150)+((soM3-100)*200))*1.05);
        }

        @Override
        public int compareTo(XangDau n) {
            return -1;
        }

        @Override
        public String toString() {
            return  ma + " " + hangSX + " " + donGia + " " + thue + " " + thanhTien;
        }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Integer.parseInt(sc.nextLine());
        ArrayList<XangDau> listXD = new ArrayList<>();
        for (long i = 1; i <= t; i++) {
            String s = sc.nextLine();
            String arr[] = s.split("\\s+");
            listXD.add(new XangDau(arr[0],Long.parseLong(arr[1])));
        }
        listXD.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }

}