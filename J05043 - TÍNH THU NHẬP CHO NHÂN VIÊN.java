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
class company{
    private String name,date;
    private double mark1,mark2;
    public company(){
        
    }
    private int xulydiem()
    {
        double avg = mark1+mark2;
        avg/=2;
        if(mark1>=8.0 && mark2>=8.0)
        {
            avg += 1.0;
        }
        else if(mark1>=7.5 && mark2>=7.5)
        {
            avg+= 0.5;
        }
        int diem= (int) Math.round(avg);
        if(diem>=10)
        {
            diem = 10;
        }
        return diem;
    }
    public void in()
    {
        String loai;
        if(xulydiem()>=9)
        {
            loai = "Xuat sac";
        }
        else if(xulydiem()>=8) loai = "Gioi";
        else if(xulydiem()>=7) loai = "Kha";
        else if(xulydiem()>=5) loai = "Trung binh";
        else loai = "Truot";
        System.out.println(chuanhoa(name) +(2021-getNam())+" "+xulydiem()+" "+loai);
        
    }
    private String chuanhoa(String fname)
    {
        String res = "";
        String[] tmp = name.toLowerCase().trim().split("\\s+");
        for(String x : tmp)
        {
            StringBuilder a = new StringBuilder(x);
            a.setCharAt(0, Character.toUpperCase(x.charAt(0)));
            res = res + a.toString()+" ";
        }
        return res;
    }
    public company(String name, String date, double mark1, double mark2) {
        this.name = name;
        this.date = date;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getNam(){
        return Integer.parseInt(date.substring(date.lastIndexOf("/")+1));
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
    
}
public class Main {

    public static class nhanVien {

        private String maNV;
        private String hoTen;
        private String chucVu;
        private int phuCapCV;
        private int luongCB;
        private int soNgay;
        private int luongChinh;
        private int tamUng;
        private int conLai;

        public nhanVien(String maNV, String hoTen, String chucVu, int luongCB, int soNgay) {
            this.maNV = maNV;
            this.hoTen = hoTen;
            this.chucVu = chucVu;
            this.luongCB = luongCB;
            this.soNgay = soNgay;
        }

        public String getMaNV() {
            return maNV;
        }

        public void setMaNV(String maNV) {
            this.maNV = maNV;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getChucVu() {
            return chucVu;
        }

        public void setChucVu(String chucVu) {
            this.chucVu = chucVu;
        }

        public int getLuongCB() {
            return luongCB;
        }

        public void setLuongCB(int luongCB) {
            this.luongCB = luongCB;
        }

        public int getSoNgay() {
            return soNgay;
        }

        public void setSoNgay(int soNgay) {
            this.soNgay = soNgay;
        }

        public int getLuongChinh() {
            return luongChinh;
        }

        public void setLuongChinh(int luongChinh) {
            this.luongChinh = luongChinh;
        }

        public int getTamUng() {
            return tamUng;
        }

        public void setTamUng(int tamUng) {
            this.tamUng = tamUng;
        }

        public int getConLai() {
            return conLai;
        }

        public void setConLai(int conLai) {
            this.conLai = conLai;
        }

        public int getPhuCapCV() {
            return phuCapCV;
        }

        public void setPhuCapCV(int phuCapCV) {
            this.phuCapCV = phuCapCV;
        }

        public void tinhPhuCapCV() {
            if (chucVu.equals("GD")) {
                this.phuCapCV = 500;
            } else if (chucVu.equals("PGD")) {
                this.phuCapCV = 400;
            } else if (chucVu.equals("TP")) {
                this.phuCapCV = 300;
            } else if (chucVu.equals("KT")) {
                this.phuCapCV = 250;
            } else {
                this.phuCapCV = 100;
            }
        }

        public void tinhLuong() {
            this.luongChinh = luongCB * soNgay;
        }

        public void tinhTamUng() {
            if ((phuCapCV + luongChinh) * 2 / 3 < 25000) {
                this.tamUng = (((phuCapCV + luongChinh) * 2 / 3) + 500) / 1000 * 1000;
            } else {
                this.tamUng = 25000;
            }
            this.conLai = phuCapCV + luongChinh - tamUng;
        }

        @Override
        public String toString() {
            return maNV + " " + hoTen + " " + phuCapCV + " " + luongChinh + " " + tamUng + " " + conLai;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nhanVien> listNV = new ArrayList<nhanVien>();
        int k = 1;
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String chucVu = sc.nextLine();
            int luongCB = Integer.parseInt(sc.nextLine());
            int soNgay = Integer.parseInt(sc.nextLine());
            String maNV = "NV" + String.format("%02d", k++);
            nhanVien a = new nhanVien(maNV, hoTen, chucVu, luongCB, soNgay);
            a.tinhPhuCapCV();
            a.tinhLuong();
            a.tinhTamUng();
            listNV.add(a);
        }

        for (nhanVien vien : listNV) {
            System.out.println(vien.toString());
        }
    }

}