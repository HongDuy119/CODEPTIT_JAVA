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
public class Main{
    static int[] a;
    static int[] b;
    static int n;
    static List<String> list;
    public static void In()
    {
        int dem = 0;
        int tmp = 0;
        for(int i=1 ; i<=n ; i++)
        {
            if(a[i]==1) dem++;
            if(a[i]==1)
            {
                if(b[i]<=tmp)
                {
                    dem=0;
                    break;
                }
                tmp = b[i];
            }
            
        }
        if(dem>1)
        {
            String k ="";
            for(int i=1 ; i<=n ;i++)
            {
                if(a[i]==1)
                {
                    k = k + String.valueOf(b[i])+" ";
                }
            }
            list.add(k);
        }
    }
    public static void Try(int i )
    {
        for(int j = 0 ; j<=1 ; j++)
        {
            a[i] = j;
            if(i==n) In();
            else Try(i+1);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = Integer.parseInt(sc.nextLine());
        list = new ArrayList<>();
        a = new int[105];
        b = new int[105];
        for(int i = 1 ; i<= n ; i++)
        {
            b[i] = sc.nextInt();
//            System.out.println(b[i]);
        }
        Try(1);
        Collections.sort(list);
        for(String x : list)
        {
            System.out.println(x);
        }
    }
}