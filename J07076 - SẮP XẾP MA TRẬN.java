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
public class J07076_SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] a = new int[n+1][m+1];
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i=1;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    if(a[i][k]>a[j][k]){
                        int q = a[i][k];
                        a[i][k] = a[j][k];
                        a[j][k] = q;
                    }
                }
            }
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
