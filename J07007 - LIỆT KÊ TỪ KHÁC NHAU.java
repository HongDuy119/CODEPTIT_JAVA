package code_ptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
class WordSet{
    private TreeSet<String> set;
    public WordSet(){
        
    }
    public WordSet(String fname) throws FileNotFoundException
    {
        set = new TreeSet<>();
        Scanner scanner = new Scanner(new File(fname));
        while(scanner.hasNext())
        {
            set.add(scanner.next().toLowerCase());
        }
    }
    public String toString() {
        for(String x : set)
        {
            System.out.println(x);
        }
       return "";
    }
    
}
public class Main {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    public static void main8769406(String[] args) throws IOException {
        WordSet ws = new WordSet("src/code_ptit/VANBAN.in");
        System.out.println(ws);
    }
}

