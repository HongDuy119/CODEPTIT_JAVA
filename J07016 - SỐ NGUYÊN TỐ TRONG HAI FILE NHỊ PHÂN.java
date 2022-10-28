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

class IOFile{
    public <T> List<T> doc(String fname)
    {
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
    public static boolean SNT(int n)
    {
        if(n<2) return false;
        for(int i = 2; i<= Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = new IOFile().doc("DATA1.in");
        List<Integer> list1 = new IOFile().doc("DATA2.in");
        int a[] = new int[1000005];
        for(int i =1000000 ; i>=0 ;i--) a[i]=0;
        int b[] = new int[1000005];
        for(int i =1000000 ; i>=0 ;i--) b[i]=0;
        for(Integer x : list)
        {
            int n = x;
            a[n]++;
        }
        for(Integer x : list1)
        {
            int n = x;
            b[n]++;
        }
        int dem = 0;
        for(int i= 2 ; i<=1000000 ; i++)
        {
            if(SNT(i) && a[i]!=0 && b[i]!=0)
            {
//                a[i] -= 1;
//                b[1000000-i]-=1;
                dem++;
                System.out.printf("%d %d %d\n",i,a[i],b[i]);
            }
        }
    }
}