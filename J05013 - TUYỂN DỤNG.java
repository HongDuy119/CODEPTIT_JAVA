import java.io.File;
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
class Lop{
    private String ma,ten,nhom,gv;

    public Lop(String ma, String ten, String nhom, String gv) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.gv = gv;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getGv() {
        return gv;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }
    
}
public class Main {

    public static class TuyenDung implements Comparable<TuyenDung>{
        private String ma,  hoTen, xepLoai;
        private double diemLT, diemTH, diemTB;

        public TuyenDung(long stt, String hoTen, double diemLT, double diemTH) {
            this.hoTen = hoTen;
            this.ma = "TS" + String.format("%02d", stt);
            this.diemLT = tinhD(diemLT);
            this.diemTH = tinhD(diemTH);
            this.diemTB = (this.diemLT+this.diemTH)/2;
            this.xepLoai = tinhXH(this.diemTB);
        }
        
        private double tinhD(double diemLT){
            if(diemLT > 10)
                diemLT /= 10;
            return diemLT;
        }
        
        
        private String tinhXH(double diemTB){
            if(diemTB < 5)
                return "TRUOT";
            else if(diemTB < 8)
                return "CAN NHAC";
            else if(diemTB <= 9.5)
                return "DAT";
            else
                return "XUAT SAC";
        }
        @Override
        public int compareTo(TuyenDung n) {
            if (this.diemTB< n.diemTB) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return  ma + " " + hoTen  + " " + String.format("%.2f", diemTB) + " " + xepLoai;
        }

        


        
        
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Integer.parseInt(sc.nextLine());
        ArrayList<TuyenDung> listNV = new ArrayList<>();
        for (long i = 1; i <= t; i++) {
            
            listNV.add(new TuyenDung(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(listNV);
        for (TuyenDung nhanVien : listNV) {
            System.out.println(nhanVien);
        }
    }
    
}