
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03006_Sodep1 {
    public static boolean so_dep_1(String s)
    {
        for(int i = 0 ; i<= s.length()/2 ; i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i) || ((int)s.charAt(i)-48)%2!=0 || ((int)s.charAt(s.length()-1-i)-48)%2!=0)
                return false;
        }
        return true;
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tes = scanner.nextInt();
        for(int i = 1 ; i<= tes ; i ++)
        {
            String s = scanner.next();
            if(so_dep_1(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
