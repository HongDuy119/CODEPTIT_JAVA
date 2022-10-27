
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03021 {
    public static boolean thuan_nghich(String n)
    {
        for(int i =0 ; i<= n.length()/2 ; i++)
        {
            if(n.charAt(i) != n.charAt(n.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ; i<= test ; i++)
        {
            String a =".ABC.DEF.GHI.JKL.MNO.PQRSTUV.WXYZ";
            String res = "";
            String s =scanner.next();
            s = s.toUpperCase();
//            System.out.println(s);
            for(int j = 0 ; j< s.length() ; j++)
            {
               int k = a.indexOf(s.charAt(j));
               if(k%4==0 && k!=0 && (k/4==6 || k/4==8))
               {
                   if(k/4==6) k=7;
                   else k = 9;
               }
               else k = k/4+2;
//                System.out.println(k);
               res += String.valueOf(k);
            }
            if(thuan_nghich(res)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
