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
public class Main{
    public static void main(String[] args) {
        List<Lop> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0)
        {
            list.add(new Lop(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        list.sort(new Comparator<Lop>(){
            @Override
            public int compare(Lop o1, Lop o2) {
                if(o1.getMa().compareTo(o2.getMa())==0)
                {
                    return o1.getNhom().compareTo(o2.getNhom());
                }
                else return o1.getMa().compareTo(o2.getMa());
                    
            }
            
        });
        int test2 = Integer.parseInt(sc.nextLine());
        while(test2-->0)
        {
            String s = sc.nextLine();
            for(Lop x :list)
            {
                if(x.getGv().compareTo(s)==0)
                {
                    System.out.println("Danh sach cho giang vien "+x.getGv()+":");
                    break;
                }
            }
            for(Lop x :list)
            {
                if(x.getGv().compareTo(s)==0)
                {
                    System.out.println(x.getMa()+" "+x.getTen()+" "+x.getNhom());
                }
            }
            
        }
    }
}