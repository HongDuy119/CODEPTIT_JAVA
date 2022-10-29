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
class Thisinh{
    private String name,date;
    private double mark1,mark2,mark3,mark;
    private int id;

    public Thisinh(String name, String date, double mark1, double mark2, double mark3,int id) {
        this.name = name;
        this.date = date;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        mark = mark1+mark2+mark3;
        this.id = id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getMark3() {
        return mark3;
    }

    public void setMark3(double mark3) {
        this.mark3 = mark3;
    }

    @Override
    public String toString() {
        return id+" "+ name +" "+date+" "+(mark1+mark2+mark3);
    }
    
}

public class Main {
    public static void main(String[] args) {
       List<Thisinh> list = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       int test = Integer.parseInt(sc.nextLine());
       for(int i = 1 ; i<=test ; i++)
       {
           list.add(new Thisinh(sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine()),i));
       }
       list.sort(new Comparator<Thisinh>(){
           @Override
           public int compare(Thisinh o1, Thisinh o2) {
               if(Double.compare(o1.getMark(), o2.getMark())==0)
               {
                   return o1.getId()-o2.getId();
               }
               else
                   return Double.compare(o2.getMark(), o1.getMark());
           }
           
       });
       double tmp = list.get(0).getMark();
       for(Thisinh x : list)
       {
           if(x.getMark()==tmp) System.out.println(x);
       }
       
    }
}

