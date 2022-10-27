
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01017_Solienke {
    public static boolean so_lien_ke(String s)
    {
        for(int i = 0 ; i< s.length()-1 ; i++){
            if(Math.abs((int)s.codePointAt(i)-(int)s.codePointAt(i+1)) != 1)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ; i <= test ; i++)
        {
            String s = scanner.next();
            if(so_lien_ke(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
