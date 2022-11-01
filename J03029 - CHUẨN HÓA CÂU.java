
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

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine())
        {
            String s = sc.nextLine().trim();
            s = s.replaceAll("\\s+", "\\ ");
            s = s.replace(" .", ".");
            s = s.replace(" !", "!");
            s = s.replace(" ?", "?");
            s = s.toLowerCase();
            StringBuilder s1 = new StringBuilder(s);
            s1.setCharAt(0, Character.toUpperCase(s.charAt(0)));
            s = s1.toString();
            if(s.charAt(s.length()-1)!='.' && s.charAt(s.length()-1)!='!' &&s.charAt(s.length()-1)!='?' )
                s+=".";
            System.out.println(s);
        }
    }
}

