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

public class Main {

    public static void Solve() {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        Set<Character> set = new HashSet<>();
        while (test-- > 0) {
            String s = scanner.nextLine();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            int k = Integer.parseInt(scanner.nextLine());
            if (26 - set.size() <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            set.clear();
        }

    }

    public static void main(String[] args) {
        Solve();
    }

}
