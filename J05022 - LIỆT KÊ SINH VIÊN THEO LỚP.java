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

class SinhVien {

    private String id, name, classs, mail;

    public SinhVien() {

    }

    public SinhVien(String id, String name, String classs, String mail) {
        this.id = id;
        this.name = name;
        this.classs = classs;
        this.mail = mail;
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

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    private String chuanhoaten(String fname) {
        String res = "";
        String[] tmp = fname.toLowerCase().trim().split("\\s+");
        for (String x : tmp) {
            StringBuilder j = new StringBuilder(x);
            j.setCharAt(0, Character.toUpperCase(x.charAt(0)));
            res = res + j + " ";
        }
        res = res.substring(0, res.length() - 1);
        return res;
    }

    @Override
    public String toString() {
        System.out.print(id + " " + name + " " + classs + " " + mail);
        return "";
    }

}

class QLSV {

    private List<SinhVien> list;

    public QLSV() {
        list = new ArrayList<>();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-->0) {
            list.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        
        List<SinhVien> qlSinhViens = this.getList();
        int test1 = Integer.parseInt(scanner.nextLine());
        while (test1-- > 0) {
            String s1 = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+s1+":");
            for (SinhVien x : qlSinhViens) {
                if(x.getClasss().compareTo(s1)==0) System.out.println(x);
            }
        }
    }

    public void sort() {
        list.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId().compareTo(o2.getId());
            }

        });
    }

    public List<SinhVien> getList() {
        return list;
    }

    public void setList(List<SinhVien> list) {
        this.list = list;
    }

}

public class Main {

    public static void main(String[] args) {
        QLSV ql = new QLSV();
        ql.input();
//        ql.sort();
        
    }

}
