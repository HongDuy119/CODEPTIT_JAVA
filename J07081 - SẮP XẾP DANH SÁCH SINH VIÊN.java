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
class Sinhvien{
    private String id,name,phone,email;

    public Sinhvien(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        String[] tmp = name.split("\\s+");
        String tmp1 = tmp[tmp.length-1]+tmp[0];
        for(int i = 0 ; i<tmp.length-1;i++)
            tmp1+=tmp[i];
        return tmp1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id +" "+name+" "+phone+" "+email;
    }
    
}
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<Sinhvien> list = new ArrayList<>();
        while(test-->0)
        {
            list.add(new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        list.sort(new Comparator<Sinhvien>(){
            @Override
            public int compare(Sinhvien o1, Sinhvien o2) {
                if(o1.getName().compareTo(o2.getName())==0)
                {
                    return o1.getId().compareTo(o2.getId());
                }
                else return o1.getName().compareTo(o2.getName());
            }
        });
        for(Sinhvien x : list)
        {
            System.out.println(x);
        }
    }
}