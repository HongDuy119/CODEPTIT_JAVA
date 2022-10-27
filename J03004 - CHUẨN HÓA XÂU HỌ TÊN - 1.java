
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03004_Chuanhoaxauhoten_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        for(int i = 1 ; i<= Integer.parseInt(test);i++)
        {
            String[] list = (scanner.nextLine().trim().split("\\s+"));
            String res ="";
            for(String s : list)
            {
                s = s.toLowerCase();
                res += String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1)+" ";
            }
            System.out.println(res);
        }
    }
    
}
