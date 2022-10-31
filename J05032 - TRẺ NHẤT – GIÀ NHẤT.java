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
class person{
    private String name;

    public person() {
    }

    public person(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }
    
    public String getName(){
        String[] tmp = name.trim().split("\\s+");
        return tmp[0];
    }
    public String getDate(){
        String[] tmp = name.split("\\s+");
        String[] tmp1 = tmp[1].split("/");
        return tmp1[2]+tmp1[1]+tmp1[0];
    }
}
public class Main{
    public static void main(String[] args) {
        List<person> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0)
        {
            list.add(new person(sc.nextLine()));
        }
        list.sort(new Comparator<person>(){
            @Override
            public int compare(person o1, person o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
            
        });
        System.out.println(list.get(list.size()-1).getName());
        System.out.println(list.get(0).getName());
    }
}