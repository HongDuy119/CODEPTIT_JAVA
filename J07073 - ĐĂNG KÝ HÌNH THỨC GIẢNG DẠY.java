package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
class Monhoc{
    private String ma,ten,sotinchi,hinhthuc,mien;

    public Monhoc(String ma, String ten, String sotinchi, String hinhthuc, String mien) {
        this.ma = ma;
        this.ten = ten;
        this.sotinchi = sotinchi;
        this.hinhthuc = hinhthuc;
        this.mien = mien;
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

    public String getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(String sotinchi) {
        this.sotinchi = sotinchi;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    public String getMien() {
        return mien;
    }

    public void setMien(String mien) {
        this.mien = mien;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+sotinchi+" "+hinhthuc+" "+mien;
    }
    
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<Monhoc> list = new ArrayList<>();
        while(test-->0)
        {
            list.add(new Monhoc(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        list.sort(new Comparator<Monhoc>(){
            @Override
            public int compare(Monhoc o1, Monhoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
            
        });
        for(Monhoc x : list)
        {
            if(x.getMien().compareTo("Truc tiep")!=0)System.out.println(x);
        }
    }
}
