
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

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static class so {

        private int[] a;
        private int k;

        public so(int[] z) {
            a = new int[6];
            for (int i = 0; i < 6; i++) {
                a[i] = z[i];
            }
        }

        public so(int n) {
            a = new int[n];
            k = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
        }

        public int[] getA() {
            return a;
        }

        public void setA(int[] a) {
            this.a = a;
        }

        public int getK() {
            return k;
        }

        public void setK(int k) {
            this.k = k;
        }

    }

    public static void main(String[] args) {
        int test = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= test; i++) {
            so a = new so(6);
            so b = new so(6);
            Queue<so> q = new LinkedList<so>();
            q.add(a);
            while (!q.isEmpty()) {
//                System.out.println("1");
                so tmp = q.poll();
                int dem = 0;
                for (int j = 0; j < 6; j++) {
                    if (b.getA()[j] == tmp.getA()[j]) {
                        dem++;
                    }
                }

                if (dem == 6) {
                    System.out.println(tmp.getK());
                    break;
                } else {
                    int tmp1[] = new int[6];
                    tmp1[0] = tmp.getA()[3];
                    tmp1[1] = tmp.getA()[0];
                    tmp1[4] = tmp.getA()[1];
                    tmp1[3] = tmp.getA()[4];
                    tmp1[2] = tmp.getA()[2];
                    tmp1[5] = tmp.getA()[5];
                    so duy = new so(tmp1);
                    duy.setK(tmp.getK() + 1);
                    q.add(duy);
                    tmp1[0] = tmp.getA()[0];
                    tmp1[3] = tmp.getA()[3];
                    tmp1[1] = tmp.getA()[4];
                    tmp1[2] = tmp.getA()[1];
                    tmp1[5] = tmp.getA()[2];
                    tmp1[4] = tmp.getA()[5];
                    so duy1 = new so(tmp1);
                    duy1.setK(tmp.getK() + 1);
                    q.add(duy1);
                }
            }
        }
    }
}
