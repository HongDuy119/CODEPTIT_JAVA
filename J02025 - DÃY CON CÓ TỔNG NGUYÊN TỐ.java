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
public class J02025_DayConCoTongNguyenTo {
    static int n;
    static int[] a = new int[22];
    static int[] x = new int[22];
    static boolean check(int k){
        if(k<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(k);i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
    static void Try(int i){
        for(int j=0;j<=1;j++){
            x[i]=j;
            if(i==n){
                int sum=0;
                for(int k=1;k<=n;k++){
                    if(x[k]==1){
                        sum+=a[k];
                    }
                }
                if(check(sum)){
                    for (int l = 1; l <= n; l++) {
                        if (x[l] == 1) {
                            System.out.print(a[l] + " ");
                        }
                    }
                    System.out.println();
                }
            }
            else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=1;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    if(a[i]<a[j]){
                        int q = a[i];
                        a[i] = a[j];
                        a[j] = q;
                    }                  
                }
            }
            Try(1);
        }
    }
}
