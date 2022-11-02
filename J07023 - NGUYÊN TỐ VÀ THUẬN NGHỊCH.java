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

public class Main {
    public static boolean check(int n)
    {
        StringBuilder tmp = new StringBuilder(String.valueOf(n));
        if(tmp.reverse().toString().compareTo(String.valueOf(n))!=0) return false;
        for(int i =2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> list1 = new IOFile().doc("DATA1.in");
        List<Integer> list2 = new IOFile().doc("DATA2.in");
        int[] a = new int[10005];
        int[] b = new int[10005];
        for(int i =0 ; i<=10000; i++)
        {
            a[i] = b[i]=0;
        }
        for(Integer x : list1)
        {
            a[x]++;
        }
        for(Integer x : list2)
        {
            b[x]++;
        }
        for(int i= 2 ; i<=10000 ; i++)
        {
            if(a[i]!=0 && b[i]!=0 && check(i)) System.out.println(i +" " + a[i]+" "+b[i]);
        }
    }
}