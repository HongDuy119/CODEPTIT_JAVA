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
class Giangvien{
    private String name,ma,id;

    public Giangvien(String name, String ma, String id) {
        this.name = name;
        String tmp  ="";
        String[] s= ma.toUpperCase().trim().split("\\s+");
        for(String x : s)
        {
            tmp += String.valueOf(x.charAt(0));
        }
        this.ma = tmp;
        this.id = id;
    }

    public String getName() {
        String tmp = name.substring(name.lastIndexOf(" ")+1);
        return tmp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+ma;
    }
    
    
}
public class Main{
    public static void main(String[] args) {
        List<Giangvien> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i<=test ; i ++)
        {
            String tmp="";
            if(i<10)
            {
                tmp = "GV0"+String.valueOf(i);
            }else tmp = "GV"+String.valueOf(i);
            list.add(new Giangvien(sc.nextLine(),sc.nextLine(),tmp));
        }
        list.sort(new Comparator<Giangvien>(){
            @Override
            public int compare(Giangvien o1, Giangvien o2) {
                if(o1.getName().compareTo(o2.getName())==0)
                {
                    return o1.getId().compareTo(o2.getId());
                }
                else return o1.getName().compareTo(o2.getName());
            }
            
        });
        for(Giangvien x : list)
        {
            System.out.println(x);
        }
    }
}