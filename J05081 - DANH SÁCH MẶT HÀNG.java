
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J05081 {
    static Scanner scanner = new Scanner(System.in);
    public static class mh{
        private String ma,ten,pt,mua,ban,loinhuan;
        public static void sapxep(mh[] a,int n)
        {
            for(int i =0 ; i<n ; i++)
            {
                for(int  j =i +1 ; j<n ; j++)
                {
                    if(Integer.parseInt(a[i].loinhuan) <Integer.parseInt(a[j].loinhuan))
                    {
                        mh tmp = a[i];
                        a[i]=a[j];
                        a[j] = tmp;
                    }
                    else if(Integer.parseInt(a[i].loinhuan) ==Integer.parseInt(a[j].loinhuan))
                    {
                        if(Integer.parseInt(a[i].ma) >Integer.parseInt(a[j].ma))
                        {
                            mh tmp = a[i];
                            a[i]=a[j];
                            a[j] = tmp;
                        }
                    }
                }
            }
        }
        public mh(){
            
        }
        public void nhap(String s)
        {
            ma = s;
            ten = scanner.nextLine();
            pt = scanner.nextLine();
            mua = scanner.nextLine();
            ban = scanner.nextLine();
            loinhuan = String.valueOf(Integer.parseInt(ban)-Integer.parseInt(mua));
        }
        public void in()
        {
            if(Integer.parseInt(ma)<10)
            {
                System.out.print("MH00"+ma+" ");
            }
            else{
                System.out.print("MH0"+ma+" ");
            }
            System.out.println( ten +" " + pt +" " + mua +" " + ban +" " +loinhuan);
        }
        
    }
    public static void main(String[] args) {
        int test = Integer.parseInt(scanner.nextLine());
        mh[] a = new mh[1000];
        for(int i =0 ; i<test ; i++)
        {
            String s = String.valueOf(i+1);
            a[i] = new mh();
            a[i].nhap(s);
        }
        mh.sapxep(a, test);
        for(int i = 0 ;i<test ; i++)
        {
            a[i].in();
        }
    }
    
}
