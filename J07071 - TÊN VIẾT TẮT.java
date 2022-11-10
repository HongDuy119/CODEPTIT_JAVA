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
class Danhsach{
    private String name;

    public Danhsach(String name) {
        this.name = name;
    }

    public String getName() {
        String[] tmp = this.name.trim().split("\\s+");
        return tmp[tmp.length-1]+tmp[0];
    }
    public String getName1() {
        String[] tmp = this.name.trim().split("\\s+");
        String tmp1 ="";
        for(String x : tmp)
        {
            tmp1+=String.valueOf(x.charAt(0));
        }
        return tmp1;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int test = Integer.parseInt(sc.nextLine()); 
        List<Danhsach> list = new ArrayList<>();
        while(test-->0){
            list.add(new Danhsach(sc.nextLine()));
        }
        list.sort(new Comparator<Danhsach>(){
            @Override
            public int compare(Danhsach o1, Danhsach o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        });
//        System.out.println("1");
        int test1 = Integer.parseInt(sc.nextLine());
        while(test1-->0){
            String[] s = sc.nextLine().trim().split("[.]");
//            for(String x : s)
//            {
//                System.out.println(x);
//            }
            for(Danhsach x : list)
            {
                int dem = 0;
                for(int i = 0 ; i<x.getName1().length();i++)
                {
                    if(s.length<x.getName1().length()) break;
                    if(String.valueOf(x.getName1().charAt(i)).compareToIgnoreCase(s[i])==0)
                    {
                        dem++;
                    }
                }
                if(dem>=x.getName1().length()-1 ) 
                {
                    System.out.println(x);
                }
            }
        }
    }
}