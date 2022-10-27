
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01018_Sokhonglienke {
    public static boolean so_khong_lien_ke(String s)
    {
        int sum = 0;
        for(int i = 0 ; i < s.length()-1 ; i++)
        {
            if(Math.abs((int)s.codePointAt(i)-(int)s.codePointAt(i+1))!=2)
            {
                return false;
            }
//            System.out.println((int)s.charAt(i));
            sum = sum + (int)s.codePointAt(i) - 48;
        }
        sum += (int)s.charAt(s.length()-1)-48;
        if(sum%10==0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for (int i = 0; i < test; i++) {
            String s = scanner.next();
            if(so_khong_lien_ke(s))
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
}
