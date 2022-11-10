
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

class IntSet{
    private TreeSet<Integer> a;
    public IntSet(){
        
    }
    public IntSet(int[] x) {
        a = new TreeSet();
        for(int k:x)
        {
            a.add(k);
        }
    }
    
    public TreeSet getA() {
        return a;
    }
    public IntSet intersection(IntSet b)
    {
        TreeSet<Integer> m = new TreeSet<>();
        for(Object x: b.getA())
        {
            if(a.contains(x))
            {
                m.add((Integer) x);
            }
        }
        setA(m);
        return this;
        
    }
    public void setA(TreeSet a) {
        this.a = a;
    }

    @Override
    public String toString() {
        for(int x : a)
        {
            System.out.print(x+" ");
        }
        return "";
    }
    
    
}
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
