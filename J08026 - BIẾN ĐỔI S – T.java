
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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

class pair{
    int first;
    int second;
    public pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int s = sc.nextInt();
            int t = sc.nextInt();
            Queue<pair> q = new LinkedList<>();
            q.add(new pair(s, 0));
            Map<Integer, Integer> map = new LinkedHashMap<>();
            map.put(s, 1);
            while(!q.isEmpty()){
                pair p = q.poll();
                if(p.first==t){
                    System.out.println(p.second);
                    break;
                }
                if(p.first-1 == t || p.first*2 ==t){
                    System.out.println(p.second+1);
                    break;
                }
                if(!map.containsKey(p.first*2) && p.first<t){
                    q.add(new pair(p.first*2, p.second+1));
                    map.put(p.first*2, 1);
                }
                if(!map.containsKey(p.first-1) && p.first-1>0){
                    q.add(new pair(p.first-1, p.second+1));
                    map.put(p.first-1, 1);
                }
            }
        }
    }
}
