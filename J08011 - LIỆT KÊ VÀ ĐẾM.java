
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

public class Main {

    public static boolean khonggiam(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) < s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()) {
            int s = sc.nextInt();
            if (!map.containsKey(s) && khonggiam(String.valueOf(s))) {
                map.put(s, 1);
            } else if (khonggiam(String.valueOf(s))) {
                map.put(s, map.get(s) + 1);
            }
        }
        Set set = map.keySet();
        for (int i = 10000; i >= 1; i--) {
            for (Object key : set) {
                if(map.get(key)==i)System.out.println(key + " " + map.get(key));
            }
        }
    }
}
