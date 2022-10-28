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
class IntSet{
    private TreeSet<Integer> set;
    public IntSet(int[] b){
        set = new TreeSet<>();
        for(int i = 0 ;i<b.length;i++)
        {
            set.add(b[i]);
        }
    }
    public TreeSet<Integer> getSet() {
        return set;
    }

    public void setSet(TreeSet<Integer> set) {
        this.set = set;
    }
    
    public IntSet union(IntSet a)
    {
        for(Integer x : a.getSet())
        {
            set.add(x);
        }
        int[] d = new int[set.size()];
        int i = 0;
        for(Integer x : set)
        {
            d[i]= x;
            i++;
        }
        return new IntSet(d);
                
    }

    @Override
    public String toString() {
        for(Integer x : set)
        {
            System.out.print(x +" ");
        }
        return "";
    }
    
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
    public static void main3202183(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}

