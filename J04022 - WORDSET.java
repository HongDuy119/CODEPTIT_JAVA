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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main8638760(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
