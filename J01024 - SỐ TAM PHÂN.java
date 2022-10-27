
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01024_Sotamphan {
    public static boolean so_tam_phan(String s)
    {
        for(int i = 0 ; i< s.length() ; i++)
        {
            if(s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='2') return false;
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ; i<=test ; i++)
        {
            String s = scanner.next();
            if(so_tam_phan(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
