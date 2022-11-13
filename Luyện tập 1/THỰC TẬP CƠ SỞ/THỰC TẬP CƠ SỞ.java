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
class Sinhvien{
    private String ma,ten,dienthoai,mail;

    public Sinhvien(String ma, String ten, String dienthoai, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.dienthoai = dienthoai;
        this.mail = mail;
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

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
class Detai{
    private String ten,detai,id;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDetai() {
        return detai;
    }

    public void setDetai(String detai) {
        this.detai = detai;
    }

    public Detai(int id,String ten, String detai) {
        this.id = String.format("DT%03d",id);
        this.ten = ten;
        this.detai = detai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
class Nhiemvu{
    private String ma,ten,sdt,email,ten1,detai;
    public Nhiemvu(){

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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTen1() {
        return ten1;
    }

    public void setTen1(String ten1) {
        this.ten1 = ten1;
    }

    public String getDetai() {
        return detai;
    }

    public void setDetai(String detai) {
        this.detai = detai;
    }

    @Override
    public String toString() {
        return ma +" "+ ten +" "+sdt +" "+email +" "+ten1+" "+detai;
    }
}
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Integer test = Integer.parseInt(sc1.nextLine());
        List<Sinhvien> list1 = new ArrayList<>();
        for (int i = 1; i <= test; i++) {
            list1.add(new Sinhvien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        Integer test2 = Integer.parseInt(sc2.nextLine());
        List<Detai> list2 = new ArrayList<>();
        for (int i = 1; i <= test2; i++) {
            list2.add(new Detai(i, sc2.nextLine(), sc2.nextLine()));
        }
        Scanner sc3 = new Scanner(new File("NHIEMVU.in"));
        int test3 = Integer.parseInt(sc3.nextLine());
        List<Nhiemvu> list3 = new ArrayList<>();
        for (int i = 1; i <= test3; i++)
        {
            String tmp[] = sc3.nextLine().trim().split("\\s+");
            Nhiemvu duy = new Nhiemvu();
            for(Sinhvien x: list1)
            {
                if(x.getMa().compareTo(tmp[0])==0)
                {
                    duy.setMa(x.getMa());
                    duy.setTen(x.getTen());
                    duy.setSdt(x.getDienthoai());
                    duy.setEmail(x.getMail());
                }
            }
            for(Detai x:list2)
            {
                if(x.getId().compareTo(tmp[1])==0)
                {
                    duy.setTen1(x.getTen());
                    duy.setDetai(x.getDetai());
                }
            }
            list3.add(duy);
        }
        list3.sort(new Comparator<Nhiemvu>() {
            @Override
            public int compare(Nhiemvu o1, Nhiemvu o2) {
                return o1.getDetai().compareTo(o2.getDetai());
            }
        });
        for(Nhiemvu x : list3)
        {
            System.out.println(x);
        }
    }
}