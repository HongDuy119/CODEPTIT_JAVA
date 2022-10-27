
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        StringBuilder s = new StringBuilder(scanner.nextLine());
        String s = scanner.nextLine();
//        System.out.println(s);
        char temporary = 'a';
        String res = "";
        for(int i = s.length()-1; i>=0 ; i--)
        {
//            System.out.println(s.);
//            System.out.println(s[i])
            if(s.charAt(i)>=temporary)
            {
                temporary = s.charAt(i);
                res = s.charAt(i) +res;
            }
        }
        System.out.println(res);
    }
    
}
