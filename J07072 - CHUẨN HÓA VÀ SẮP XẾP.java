package code_ptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Danhsach {

    private String name;

    public Danhsach() {
    }

    public Danhsach(String name) {
        this.name = name;
    }

    public String getName() {
        return chuanhoaten();
    }

    public void nhap(String name) {
        this.name = name;
    }

    private String chuanhoaten() {
        String res = "";
        String[] tmp = name.toLowerCase().trim().split("\\s+");
        for (String x : tmp) {
            StringBuilder j = new StringBuilder(x);
            j.setCharAt(0, Character.toUpperCase(x.charAt(0)));
            res = res + j + " ";
        }
        res = res.substring(0, res.length()-1);
        return res;
    }

    public String getname() {
        String[] tmp = getName().trim().split("\\s+");
        return tmp[tmp.length - 1];
    }

    public String getdem() {
        String[] tmp = getName().trim().split("\\s+");
        String res = "";
        for(int i =1 ; i<tmp.length-1 ; i++)
        {
            res += tmp[i];
        }
        return res;
    }
    public String getho() {
        String[] tmp = getName().trim().split("\\s+");
        return tmp[0];
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        List<Danhsach> duy = new ArrayList<>();
        while (scanner.hasNextLine()) {
            Danhsach tmp = new Danhsach(scanner.nextLine());
            duy.add(tmp);
        }
        duy.sort(new Comparator<Danhsach>() {
            @Override
            public int compare(Danhsach o1, Danhsach o2) {
                if (o1.getname().compareTo(o2.getname()) == 0) {
                    if(o1.getho().compareTo(o2.getho())==0)
                    {
                        return o1.getdem().compareTo(o2.getdem());
                    } 
                    else return o1.getho().compareTo(o2.getho());
                } else {
                    return o1.getname().compareTo(o2.getname());
                }
            }

        });
        for (Danhsach x : duy) {
//            System.out.println(x.getho() + " " + x.getdem() +" "+x.getname());
            System.out.println(x.getName());
        }
    }
}
