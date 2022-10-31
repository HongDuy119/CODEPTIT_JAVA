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
class Mathang{
    private String name,gr;
    private double cost1,cost2,cost;
    private int id;

    public Mathang(int id,String name, String gr, double cost1, double cost2) {
        this.name = name;
        this.gr = gr;
        this.cost1 = cost1;
        this.cost2 = cost2;
        this.id =id;
        this.cost = cost2-cost1;
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

    public double getCost1() {
        return cost1;
    }

    public void setCost1(double cost1) {
        this.cost1 = cost1;
    }

    public double getCost2() {
        return cost2;
    }

    public void setCost2(double cost2) {
        this.cost2 = cost2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return id+" "+name+" "+gr+" "+String.format("%.2f", cost);
    }
    
    
}
public class Main{
    public static void main(String[] args) {
        List<Mathang> list  = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for(int i= 1 ;i<= test ; i++)
        {
            list.add(new Mathang(i,sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine())));
        }
        list.sort(new Comparator<Mathang>(){
            @Override
            public int compare(Mathang o1, Mathang o2) {
                return Double.compare(o2.getCost(), o1.getCost());
            }
            
        });
        for(Mathang x : list)
        {
            System.out.println(x);
        }
    }
}