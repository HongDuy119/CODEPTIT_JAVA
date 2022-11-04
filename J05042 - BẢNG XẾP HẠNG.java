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

    public static class XepHang implements Comparable<XepHang>{
        private String hoTen;
        private int ac, sub;

        public XepHang(String hoTen, int ac, int sub) {
            this.hoTen = hoTen;
            this.ac = ac;
            this.sub = sub;
        }
        
        
        @Override
        public int compareTo(XepHang n) {
            if (this.ac < n.ac) {
                return 1;
            }
            else if(this.ac == n.ac && this.sub > n.sub){
                return 1;
            }
            else if(this.ac == n.ac && this.sub == n.sub && this.hoTen.compareTo(n.hoTen) > 0){
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return  hoTen + " " + ac + " " + sub ;
        }
        
        
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<XepHang> listNV = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String hoTen = in.nextLine();
            String a = in.nextLine();  
            String arr[] = a.split("\\s+");
            int ac = Integer.parseInt(arr[0]);
            int sub = Integer.parseInt(arr[1]);
            listNV.add(new XepHang(hoTen, ac, sub));
        }
        Collections.sort(listNV);
        for (XepHang nhanVien : listNV) {
            System.out.println(nhanVien);
        }
    }
    
}import java.io.File;
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

    public static class XepHang implements Comparable<XepHang>{
        private String hoTen;
        private int ac, sub;

        public XepHang(String hoTen, int ac, int sub) {
            this.hoTen = hoTen;
            this.ac = ac;
            this.sub = sub;
        }
        
        
        @Override
        public int compareTo(XepHang n) {
            if (this.ac < n.ac) {
                return 1;
            }
            else if(this.ac == n.ac && this.sub > n.sub){
                return 1;
            }
            else if(this.ac == n.ac && this.sub == n.sub && this.hoTen.compareTo(n.hoTen) > 0){
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return  hoTen + " " + ac + " " + sub ;
        }
        
        
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<XepHang> listNV = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String hoTen = in.nextLine();
            String a = in.nextLine();  
            String arr[] = a.split("\\s+");
            int ac = Integer.parseInt(arr[0]);
            int sub = Integer.parseInt(arr[1]);
            listNV.add(new XepHang(hoTen, ac, sub));
        }
        Collections.sort(listNV);
        for (XepHang nhanVien : listNV) {
            System.out.println(nhanVien);
        }
    }
    
}