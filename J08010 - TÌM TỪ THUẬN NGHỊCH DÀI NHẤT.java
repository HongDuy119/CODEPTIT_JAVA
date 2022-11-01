import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
    public static boolean thuangnhich(String s)
    {
        StringBuilder tmp = new StringBuilder(s);
        if(tmp.reverse().toString().compareTo(s)==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();
        while(sc.hasNext())
        {
            String s = sc.next();
            if(!map.containsKey(s) && thuangnhich(s))
            {
                map.put(s, 1);
            }
            else if(thuangnhich(s))
            {
                map.put(s, map.get(s)+1);
            }
        }
        Set set = map.keySet();
        int maxN  = Integer.MIN_VALUE;
        for(Object key : set)
        {
            String tmp = (String) key;
            if(tmp.length()>=maxN)
            {
                maxN =tmp.length();
            }
        }
        for(Object key : set)
        {
            String tmp = (String) key;
            if(tmp.length()==maxN)
            {
                System.out.println(key +" "+ map.get(key));
            }
        }
        
    }
}