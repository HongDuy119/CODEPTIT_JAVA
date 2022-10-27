
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03008_Sodep3 {
    public static boolean snt(int n)
    {
        if(n<2) return false;
        else
            for(int i = 2 ; i <= Math.sqrt(n) ; i++)
            {
                if(n%i==0) return false;
            }
        return true;
    }
    public static boolean so_dep_3(String s)
    {
        for(int i = 0 ; i<=s.length()/2 ; i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i) || !snt((int)s.charAt(i)-48) || !snt((int)s.charAt(s.length()-i-1) -48)) return false;
        }
        return true;
    }
       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ; i<= test ; i++)
        {
            String s = scanner.next();
            if(so_dep_3(s)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
