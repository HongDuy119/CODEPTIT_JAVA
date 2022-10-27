
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test-->0)
        {
            String s = scanner.nextLine();
            if(s.charAt(5)==s.charAt(6) && s.charAt(5)==s.charAt(9) && s.charAt(5)==s.charAt(7) && s.charAt(5)==s.charAt(10)) System.out.println("YES");
            else if(s.charAt(5)==s.charAt(6) && s.charAt(5)==s.charAt(7) && s.charAt(9)==s.charAt(10)) System.out.println("YES");
            else if((s.charAt(5)=='6'|| s.charAt(5)=='8') && (s.charAt(6)=='6' || s.charAt(6)=='8') && (s.charAt(7)=='6' || s.charAt(7)=='8') && (s.charAt(9)=='6' || s.charAt(9)=='8') && (s.charAt(10)=='6' || s.charAt(10)=='8')) System.out.println("YES");
            else if(s.charAt(5)<s.charAt(6) && s.charAt(6)<s.charAt(7) && s.charAt(7)<s.charAt(9) && s.charAt(9)<s.charAt(10)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
