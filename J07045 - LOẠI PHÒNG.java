
package code_ptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class LoaiPhong implements Comparable<LoaiPhong>{
    private String name;
    public LoaiPhong(){
        
    }
    
    public LoaiPhong(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName1()
    {
        String[] tmp = name.split("\\s++");
        return tmp[1];
    }
    @Override
    public int compareTo(LoaiPhong o) {
        return getName1().compareTo(o.getName1());
    }

    @Override
    public String toString() {
        return name;
    }
    
}

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("src/code_ptit/PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
