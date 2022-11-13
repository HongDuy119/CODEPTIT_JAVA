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
        List<String> list = new IOFile().doc("DATA.in");
        Map<String ,Integer> map = new TreeMap<>();
        for(String s : list)
        {
            s = s.toLowerCase();
            s += ".";
            String tmp ="";
            for(int i = 0 ; i<s.length()-1;i++)
            {
                if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0'&& s.charAt(i)<='9'))
                {
                    tmp += s.charAt(i);
//                    System.out.println(tmp);
                    if((s.charAt(i+1)<'a' || s.charAt(i+1)>'z')&& (s.charAt(i+1)<'0'|| s.charAt(i+1)>'9'))
                    {
//                        System.out.println("1");
                        if(!map.containsKey(tmp)) map.put(tmp,1);
                        else map.put(tmp,map.get(tmp)+1);
                        tmp = "";
                    }
                }
            }

        }
        Set set = map.keySet();
        for(int i = 100 ; i>=0 ; i--)
        {
            for(Object key: set)
            {
                if(map.get(key)==i) System.out.println(key +" "+map.get(key));
            }
        }
    }
}