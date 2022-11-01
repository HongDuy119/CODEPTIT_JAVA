
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
class Doibong{
    private String id,name; 
    private int cost;

    public Doibong(String id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Doibong> list = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0)
        {
            list.add(new Doibong(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        int test1 = Integer.parseInt(sc.nextLine());
        while(test1-->0)
        {
            String s  = sc.nextLine();
            String tmp[] = s.trim().split("\\s+");
            String tmp1 = tmp[0].substring(1, 3);
            for(Doibong x : list )
            {
                if(tmp1.compareTo(x.getId())==0)
                {
                    System.out.println(tmp[0] +" "+x.getName()+" "+(Integer.parseInt(tmp[1])*x.getCost()));
                }
            }
        }
    }
}