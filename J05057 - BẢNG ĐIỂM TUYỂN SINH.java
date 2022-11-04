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
class company{
    private String name,date;
    private double mark1,mark2;
    public company(){
        
    }
    private int xulydiem()
    {
        double avg = mark1+mark2;
        avg/=2;
        if(mark1>=8.0 && mark2>=8.0)
        {
            avg += 1.0;
        }
        else if(mark1>=7.5 && mark2>=7.5)
        {
            avg+= 0.5;
        }
        int diem= (int) Math.round(avg);
        if(diem>=10)
        {
            diem = 10;
        }
        return diem;
    }
    public void in()
    {
        String loai;
        if(xulydiem()>=9)
        {
            loai = "Xuat sac";
        }
        else if(xulydiem()>=8) loai = "Gioi";
        else if(xulydiem()>=7) loai = "Kha";
        else if(xulydiem()>=5) loai = "Trung binh";
        else loai = "Truot";
        System.out.println(chuanhoa(name) +(2021-getNam())+" "+xulydiem()+" "+loai);
        
    }
    private String chuanhoa(String fname)
    {
        String res = "";
        String[] tmp = name.toLowerCase().trim().split("\\s+");
        for(String x : tmp)
        {
            StringBuilder a = new StringBuilder(x);
            a.setCharAt(0, Character.toUpperCase(x.charAt(0)));
            res = res + a.toString()+" ";
        }
        return res;
    }
    public company(String name, String date, double mark1, double mark2) {
        this.name = name;
        this.date = date;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getNam(){
        return Integer.parseInt(date.substring(date.lastIndexOf("/")+1));
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }
    
}
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            students.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        students.forEach(System.out::println);
    }
}

final class Student {
    private String id;
    private String name;
    private double score1, score2, score3;
    private String status;

    public Student(String id, String name, double score1, double score2, double score3) {
        this.id = id;
        setName(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
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
        String[] list = name.trim().split("\\s+");
        for (int i = 0; i < list.length; i++)
            list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1).toLowerCase();
        this.name = String.join(" ", list);
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    private String getPriorityScore() {
        switch(id.substring(2, 3)) {
            case "1":
                return "0.5";
            case "2":
                return "1";
            default:
                return "2.5";
        }
    }
    
    public String getScore() {
        double score = score1*2+score2+score3;
        if (score + Double.parseDouble(getPriorityScore()) >= 24) status = "TRUNG TUYEN";
        else status = "TRUOT";
        if (score == (int) score)
            return Integer.toString((int) score);
        return String.format("%.1f", score);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getPriorityScore() + " " + getScore() + " " + status;
    }
}