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
class Doanhnghiep{
    private String id,name;
    private int quantity;

    public Doanhnghiep(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id +" "+name +" "+quantity;
    }
    
}
public class Main {
    public static void main(String[] args)  {
        List<Doanhnghiep> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-->0)
        {
            list.add(new Doanhnghiep(sc.nextLine(),sc.nextLine(),Integer.parseUnsignedInt(sc.nextLine())));
        }
        list.sort(new Comparator<Doanhnghiep>(){
            @Override
            public int compare(Doanhnghiep o1, Doanhnghiep o2) {
                if(o1.getQuantity()==o2.getQuantity())
                {
                    return o1.getId().compareTo(o2.getId());
                    
                }
                else return o2.getQuantity()-o1.getQuantity();
            }
            
        });
        int test1 = Integer.parseInt(sc.nextLine());
        while(test1-->0)
        {
            int num1 = Integer.parseInt(sc.next());
            int num2 = Integer.parseInt(sc.next());
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+num1+" DEN "+num2 +" SINH VIEN:");
            for(Doanhnghiep x : list)
            {
                 if(x.getQuantity()>=num1 && x.getQuantity()<=num2) System.out.println(x);
            }
        }
    }
}
