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
class Khachhang{
    private String id ,name,gt,date,diachi;

    public Khachhang(int id, String name, String gt, String date, String diachi) {
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.name =chuanhoaten();
        this.gt = gt;
        this.date = date;
        trueDate();
        this.diachi = diachi;
    }
    public void trueDate(){
        String s = this.date;
        if(s.charAt(1) == '/') s = "0" + s;
        if(s.charAt(4) == '/') s = s.substring(0, 3) + "0" + s.substring(3, s.length());
        this.date = s;
    }
    public String chuanhoaten() {
        String res = "";
        String[] tmp = name.toLowerCase().trim().split("\\s+");
        for (String x : tmp) {
            StringBuilder j = new StringBuilder(x);
            j.setCharAt(0, Character.toUpperCase(x.charAt(0)));
            res = res + j + " ";
        }
        res = res.substring(0, res.length()-1);
        return res;
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

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getDate(){
        String[] tmp1 = date.split("/");
        return tmp1[2]+tmp1[1]+tmp1[0];
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return id +" "+name +" "+gt+" "+diachi+" "+date;
    }

    
    
}
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<Khachhang> list = new ArrayList<>();
        for(int i =1 ; i <= test ; i++)
        {
            list.add(new Khachhang(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        list.sort(new Comparator<Khachhang>(){
            @Override
            public int compare(Khachhang o1, Khachhang o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
            
        });
        for(Khachhang x : list)
        {
            System.out.println(x);
        }
        
    }
}