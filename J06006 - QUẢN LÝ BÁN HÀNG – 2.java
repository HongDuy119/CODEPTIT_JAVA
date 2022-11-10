
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

class Khach{
    private String name,gioitinh,ngay,diachi,id;

    public Khach(int id,String name, String gioitinh, String ngay, String diachi) {
        this.id = String.format("KH%03d",id);
        this.name = name;
        this.gioitinh = gioitinh;
        this.ngay = ngay;
        this.diachi = diachi;
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
class Mathang{
    private String ten,donvi,id;
    private int giamua,giaban;

    public Mathang(int id,String ten, String donvi, int giamua, int giaban) {
        this.id = String.format("MH%03d",id);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGiamua() {
        return giamua;
    }

    public void setGiamua(int giamua) {
        this.giamua = giamua;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }
}
class QLKH{
    private String ma,ten,diachi,tenmathang;
    private int soluong,thanhtien,lai;

    public QLKH() {
    }

    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }

    public int getLai() {
        return lai;
    }

    public void setLai(int lai) {
        this.lai = lai;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTenmathang() {
        return tenmathang;
    }

    public void setTenmathang(String tenmathang) {
        this.tenmathang = tenmathang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }


    @Override
    public String toString() {
        return ma+" "+ten+" "+diachi+" "+tenmathang+" "+soluong+" "+thanhtien+" "+lai;
    }
}
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("src/DATA.in"));
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        List<Khach> listK = new ArrayList<>();
        List<Mathang> listM = new ArrayList<>();
        for(int i = 1 ; i<= test ; i++)
        {
            listK.add(new Khach(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int test1 = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i<= test1 ; i++)
        {

            listM.add(new Mathang(i,sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        int test3 = Integer.parseInt(sc.nextLine());
        List<QLKH> list3 = new ArrayList<>();
        for(int i =1 ; i<= test3 ; i++)
        {
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            String duy="";
            QLKH tmp1 = new QLKH();
            if(i<=9)
            {
                duy = "HD00"+String.valueOf(i);

            }
            else
            {
                duy = "HD0"+String.valueOf(i);
            }
            tmp1.setMa(duy);
            for(Khach x:listK)
            {
//                System.out.println(x.getId());
                if(x.getId().compareTo(tmp[0])==0)
                {
                    tmp1.setTen(x.getName());
                    tmp1.setDiachi(x.getDiachi());
                }
            }
            int k =0;
            for(Mathang x:listM)
            {
                if(x.getId().compareTo(tmp[1])==0)
                {
                    tmp1.setTenmathang(x.getTen());
                    tmp1.setSoluong(Integer.parseInt(tmp[2]));
                    k = x.getGiaban()*Integer.parseInt(tmp[2]);
                    tmp1.setThanhtien(k);
                    tmp1.setLai(tmp1.getSoluong()*(x.getGiaban()-x.getGiamua()));
                }
            }
            list3.add(tmp1);
        }
        list3.sort(new Comparator<QLKH>() {
            @Override
            public int compare(QLKH o1, QLKH o2) {
                return o2.getLai()-o1.getLai();
            }
        });
        for(QLKH x:list3)
        {
            System.out.println(x);
        }
    }
}