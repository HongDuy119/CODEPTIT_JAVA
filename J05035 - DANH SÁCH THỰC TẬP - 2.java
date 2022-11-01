
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
class Thuctap{
    private int id;
    private String msv,name,gr,email,company;

    public Thuctap(int id, String msv, String name, String gr, String email, String company) {
        this.id = id;
        this.msv = msv;
        this.name = name;
        this.gr = gr;
        this.email = email;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return id +" "+msv+" "+name+" "+gr+" "+email+" "+company;
    }
    
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Thuctap> list = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i<=test ; i++)
        {
            list.add(new Thuctap(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        list.sort(new Comparator<Thuctap>(){
            @Override
            public int compare(Thuctap o1, Thuctap o2) {
                return o1.getMsv().compareTo(o2.getMsv());
            }
            
        });
        int test2 = Integer.parseInt(sc.nextLine());
        while(test2-->0)
        {
            String s = sc.nextLine();
            for(Thuctap x : list)
            {
                if(x.getCompany().compareTo(s)==0)
                {
                    System.out.println(x);
                }
            }
        }
    }
}