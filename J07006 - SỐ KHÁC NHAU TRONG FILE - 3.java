package code_ptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

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
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = new IOFile().doc("DATA.in");
        int a[] = new int[1005];
        for(int i =0 ; i<=1000 ;i++) a[i]=0;
        for(Integer x : list)
        {
            int n = x;
            a[n]++;
        }
        for(int i= 0 ; i<=1000 ; i++)
        {
            if(a[i]>0) System.out.printf("%d %d\n",i,a[i]);
        }
    }
}
