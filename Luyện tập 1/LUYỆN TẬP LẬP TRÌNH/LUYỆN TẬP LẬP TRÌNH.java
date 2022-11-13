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
class sub{
    private String ten;
    private int dung,nop;

    public sub(String ten, String s) {
        this.ten = ten;
        String tmp[] = s.split("\\s+");
        this.dung = Integer.parseInt(tmp[0]);
        this.nop = Integer.parseInt(tmp[1]);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDung() {
        return dung;
    }

    public void setDung(int dung) {
        this.dung = dung;
    }

    public int getNop() {
        return nop;
    }

    public void setNop(int nop) {
        this.nop = nop;
    }

    @Override
    public String toString() {
        return ten  +" "+dung +" "+nop;
    }
}
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<sub> list = new ArrayList<>();
        for (int i = 1; i <= test; i++)
        {
            list.add(new sub(sc.nextLine(),sc.nextLine()));
        }
        list.sort(new Comparator<sub>() {
            @Override
            public int compare(sub o1, sub o2) {
                if(o1.getDung()==o2.getDung())
                {
                    return  o1.getNop()-o2.getNop();
                }
                else return o2.getDung()-o1.getDung();
            }
        });
        for(sub x : list)
        {
            System.out.println(x);
        }
    }
}