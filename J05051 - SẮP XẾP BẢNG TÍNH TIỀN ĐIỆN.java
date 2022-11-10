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
class Danhsach{
    private String name;

    public Danhsach(String name) {
        this.name = name;
    }

    public String getName() {
        String[] tmp = this.name.trim().split("\\s+");
        return tmp[tmp.length-1]+tmp[0];
    }
    public String getName1() {
        String[] tmp = this.name.trim().split("\\s+");
        String tmp1 ="";
        for(String x : tmp)
        {
            tmp1+=String.valueOf(x.charAt(0));
        }
        return tmp1;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
public class Main {
    
    public static class TienDien implements Comparable<TienDien> {
        
        private String sD, maKH;
        private int chiSoCu, chiSoMoi, heSo, thanhtien, phuTroi, tongTien;
        
        public TienDien(int sTT, String sD, int chiSoCu, int chiSoMoi) {
            this.maKH = "KH" + String.format("%02d", sTT);
            this.chiSoCu = chiSoCu;
            this.chiSoMoi = chiSoMoi;
            this.heSo = tinhHeSo(sD);
            this.thanhtien = (chiSoMoi - chiSoCu) * this.heSo * 550;
            this.phuTroi = tinhPhuTroi(chiSoMoi, chiSoCu, this.thanhtien);
            this.tongTien = this.phuTroi + this.thanhtien;
        }

        private static int tinhHeSo(String sD) {
            if (sD.equals("KD")) {
                return 3;
            } else if (sD.equals("NN")) {
                return 5;
            } else if (sD.equals("TT")) {
                return 4;
            } else {
                return 2;
            }
        }

        private static int tinhPhuTroi(int chiSoMoi, int chiSoCu, int thanhTien) {
            int chiSo = chiSoMoi - chiSoCu;
            if (chiSo < 50) {
                return 0;
            } else if (chiSo <= 100) {
                float x = (float) (thanhTien * 0.35);
                x = Math.round(x);
                return (int) (x);
            } else {
                return thanhTien;
            }
            
        }

        @Override
        public int compareTo(TienDien n) {
            if (this.tongTien <= n.tongTien) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return maKH + " " + heSo + " " + thanhtien + " " + phuTroi + " " + tongTien;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<TienDien> listTD = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            listTD.add(new TienDien(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(listTD);
        for (TienDien tienDien : listTD) {
            System.out.println(tienDien);
        }
    }
}