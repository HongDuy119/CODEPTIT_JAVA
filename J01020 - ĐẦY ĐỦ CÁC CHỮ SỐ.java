
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0)
        {
            int c = sc.nextInt();
            int[] k = new int[10];
            if(c==0) System.out.println("Impossible");
            else
            {
                int j =2;
                int a = c;
                while(true)
                {

                    String tmp = String.valueOf(a);
//                    System.out.println(tmp);
                    for(int i =0 ; i<tmp.length();i++)
                    {
                        k[(int)tmp.charAt(i)-48]++;
                    }
                    int dem = 0;
                    for(int i =0 ; i<=9 ; i++)
                    {
                        if(k[i]>0) dem++;
                    }
                    if(dem==10)
                    {
                        System.out.println(a);
                        break;
                    }
                    a = c*j;
                    j++;
                }
            }
        }
    }
}