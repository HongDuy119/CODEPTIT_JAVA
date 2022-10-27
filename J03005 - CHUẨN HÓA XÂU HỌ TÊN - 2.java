
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03005_Chuanhoaxauhoten_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        for(int i = 1 ; i <= Integer.parseInt(test) ; i++)
        {
            String s[] = scanner.nextLine().toLowerCase().trim().split("\\s+");
            String res ="";
            for(int j =1 ; j<s.length ; j++)
            {
                String tam = s[j];
                res += String.valueOf(tam.charAt(0)).toUpperCase()+tam.substring(1);
                if(j==s.length-1) res += ',';
                res += " ";
            }
            String tam = s[0];
            res += String.valueOf(tam.toUpperCase());
            System.out.println(res);
        }
    }
    
}
