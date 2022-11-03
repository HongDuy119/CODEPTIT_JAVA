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
class WordSet{
    private TreeSet<String> set;

    public WordSet(String s) {
        set = new TreeSet<>();
        String[] tmp = s.toLowerCase().trim().split("\\s+");
        for(String x : tmp)
        {
            set.add(x);
        }
    }
    public String union(WordSet tmp)
    {
        TreeSet<String> duy = new TreeSet<>();
        for(String x : tmp.getSet())
        {
            duy.add(x);
        }
        for(String x : set)
        {
            duy.add(x);
        }
        String tmp1="";
        for(String x : duy)
        {
            tmp1 = tmp1 +x +" ";
        }
        return tmp1;
    }
    public String intersection(WordSet tmp){
        TreeSet<String> res = new TreeSet<>();
        TreeSet<String> tmp1 = tmp.getSet();
        for(String x : tmp1)
        {
            if(set.contains(x))
            {
                res.add(x);
            }
        }
        String duy = "";
        for(String x : res)
        {
            duy = duy +x +" ";
        }
        return duy;
            
    }
    public TreeSet<String> getSet() {
        return set;
    }

    public void setSet(TreeSet<String> set) {
        this.set = set;
    }
    
}
public class Main{
    public static class Point {

        private double x1;
        private double y1;

        private double x2;
        private double y2;

        private double x3;
        private double y3;

        public Point(double x1, double y1, double x2, double y2, double x3, double y3) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        }

        public double dis(double x1, double y1, double x2, double y2) {
            return Math.sqrt((Math.pow((x1 - x2), 2)) + Math.pow((y1 - y2), 2));
        }

        public void in() {
            double dis1 = dis(x1, y1, x2, y2);
            double dis2 = dis(x1, y1, x3, y3);
            double dis3 = dis(x3, y3, x2, y2);

            if (dis1 + dis2 > dis3 && dis1 + dis3 > dis2 && dis2 + dis3 > dis1) {
                double r = (dis1*dis2*dis3)/(Math.sqrt((dis1+dis2+dis3)*(dis1+dis2-dis3)*(dis1-dis2+dis3)*(-dis1+dis2+dis3)));
                double dt = r*r*Math.PI;
                System.out.printf("%.3f", dt);
            } else {
                System.out.print("INVALID");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point a = new Point(x1, y1, x2, y2, x3, y3);
            a.in();

        }
    }
}