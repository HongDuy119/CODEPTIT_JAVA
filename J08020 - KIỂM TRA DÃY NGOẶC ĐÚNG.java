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
class Point{
    double x,y;
    public Point(){
        
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void nhap(Scanner s) {
        x = s.nextDouble();
        y = s.nextDouble();
    }
    public double distance(Point secondPoint) {
        double d1 = this.x - secondPoint.x;
        double d2 = this.y - secondPoint.y;
        return Math.sqrt((d1 * d1) + (d2 * d2));
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
     public static boolean check(char x, char y) {
        if (x == '(' && y == ')')
            return true;
        if (x == '[' && y == ']')
            return true;
        if (x == '{' && y == '}')
            return true;
        return false;
    }

    public static boolean resolve(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (st.empty())
                st.push(c);
            else {
                if (check(st.peek(), c))
                    st.pop();
                else
                    st.push(c);
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            if (resolve(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }
}
