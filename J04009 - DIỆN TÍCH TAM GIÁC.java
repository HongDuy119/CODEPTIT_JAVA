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
class Point{
    double x,y;
    public Point(){
        
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void nhap(Scanner s) {
        x = s.nextDouble();
        y = s.nextDouble();
    }
    public double distance(Point secondPoint) {
        double d1 = this.x - secondPoint.x;
        double d2 = this.y - secondPoint.y;
        return Math.sqrt((d1 * d1) + (d2 * d2));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            Point p1 = new Point();
            Point p2 = new Point();
            Point p3 = new Point();

            p1.nhap(sc);
            p2.nhap(sc);
            p3.nhap(sc);

            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);
            
            if (a + b > c && a + c > b && b + c > a) {
                double res = Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c))/(double)4;
                res = Math.round(res*100);
                res = res/100;
                System.out.printf("%.2f\n",res);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
