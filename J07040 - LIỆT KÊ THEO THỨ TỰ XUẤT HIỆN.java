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
    public static void main(String[] args) throws FileNotFoundException {
        List<String> list = new IOFile().doc("NHIPHAN.in");
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        for(String i:list){
            String[] s = i.trim().toLowerCase().split("\\s+");
            set.addAll(Arrays.asList(s));
        }
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(set.contains(s)){
                System.out.println(s);
                set.remove(s);
            }
        }
    }
}