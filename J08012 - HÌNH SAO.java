
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt()-1;
        int test1 = test;
        String res = "No";
        int[] a = new int[test + 5];
        for (int i = 0; i <= test; i++) {
            a[i] = 0;
        }
        while (test-- > 0) {
            int b1, b2;
            b1 = sc.nextInt();
            a[b1]++;
            b2 = sc.nextInt();
            a[b2]++;
            if (a[b1] == test1 - 1) {
                res = "Yes";
            }
            if (a[b2] == test1 - 1) {
                res = "Yes";
            }
        }
        System.out.println(res);
    }

}
