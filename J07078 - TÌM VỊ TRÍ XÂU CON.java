
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
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int test = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= test; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            for (int j = 0; j <= s1.length() - s2.length(); j++)
            {
                if(s2.charAt(0)==s1.charAt(j))
                {
                    String tmp = s1.substring(j,j+s2.length());
                    if(tmp.compareTo(s2)==0)
                    {
                        System.out.print((j+1)+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

