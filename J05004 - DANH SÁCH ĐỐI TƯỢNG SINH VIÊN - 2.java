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

class IOFile{
    public <T> List<T> doc(String fname)
    {
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
    private String name,gr,date;
    private double gpa;
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
    public Sinhvien(String name, String gr, String date, double gpa) {
        this.name = name;
        this.name=this.chuanhoaten();
        this.gr = gr;
        this.date = date;
        this.gpa = gpa;
        this.trueDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for(int i =1 ; i<=test ; i++)
        {
            Sinhvien x = new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine()));
            if(i<10)
            {
                System.out.printf("B20DCCN00%d ",i);
                System.out.print(x.getName()+" "+x.getGr()+" "+x.getDate()+" ");
                System.out.printf("%.2f\n",x.getGpa());
            }
            else
            {
                System.out.printf("B20DCCN0%d ",i);
                System.out.print(x.getName()+" "+x.getGr()+" "+x.getDate()+" ");
                System.out.printf("%.2f\n",x.getGpa());
            }
        }
    }
}