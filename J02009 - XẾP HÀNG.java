/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hong Duy
 */
class Hanhkhach{
    private int start,time;
    public Hanhkhach(){
        
    }
    public Hanhkhach(int start, int time) {
        this.start = start;
        this.time = time;
    }
//    public void nhap()
//    {
//        start = scanner.nextInt();
//        time = scanner.nextInt();
//    }
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
}
//class QLKH{
//    private List<Hanhkhach> list;
//
//    public List<Hanhkhach> getList() {
//        return list;
//    }
//
//    public void setList(List<Hanhkhach> list) {
//        this.list = list;
//    }
//    
//    private Scanner scanner = new Scanner(System.in);
//    public QLKH(){
//        list = new ArrayList<>();
//    }
//    public void nhap()
//    {
//        list.add(new Hanhkhach(scanner.nextInt(),scanner.nextInt()));
//    }
//    public void sorthk()
//    {
//        list.sort(new Comparator<Hanhkhach>(){
//            @Override
//            public int compare(Hanhkhach o1, Hanhkhach o2) {
//                return o1.getStart()-o2.getStart();
//            }
//            
//        });
//    }
//}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        List<Hanhkhach> duy = new ArrayList<>();
        while(test-->0)
        {
            Hanhkhach tmp = new Hanhkhach(scanner.nextInt(),scanner.nextInt());
            duy.add(tmp);
        }
        
        int res = 0;
        duy.sort(new Comparator<Hanhkhach>(){
            @Override
            public int compare(Hanhkhach o1, Hanhkhach o2) {
                return o1.getStart()-o2.getStart();
            }
            
        });
        for(Hanhkhach x : duy)
        {
            if(x.getStart()>res) res = x.getStart();
            res = res + x.getTime();
        }
        System.out.println(res);
    }
}