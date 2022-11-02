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
class WordSet{
    private TreeSet<String> a;

    public TreeSet<String> getA() {
        return a;
    }

    public void setA(TreeSet<String> a) {
        this.a = a;
    }

   

    
    public WordSet(String fname) throws FileNotFoundException
    {
        a = new TreeSet<>();
        Scanner sc = new Scanner(new File(fname));
        while(sc.hasNext())
        {
            a.add(sc.next().toLowerCase());
        }
    }
    public String difference(WordSet s1)
    {
        String tmp ="";
        for(String x : a)
        {
            if(!s1.getA().contains(x))
            {
                tmp = tmp +x+" ";
            }
        }
        return tmp;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
    public static void main9760767(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
