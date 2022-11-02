import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
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
    public static int sum(String s)
    {
        int sum1 = 0;
        for(int i = 0 ; i<s.length() ; i++)
        {
            sum1 += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum1;
    }
    public static void main(String[] args) {
        List<String> list = new IOFile().doc("DATA.in");
        for(String x : list)
        {
            String s = "";
            for(int i = 0 ; i<x.length(); i++)
            {
                if(x.charAt(i)>='0' && x.charAt(i)<='9')
                {
                    if(s=="" && x.charAt(i)!='0')
                    {
                        s+=x.charAt(i);
                    }
                    else if(s.length()!=0) s += x.charAt(i);
                }
            }
            System.out.println(s +" "+sum(s));
        }
    }

}