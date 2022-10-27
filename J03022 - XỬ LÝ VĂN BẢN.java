
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while(scanner.hasNext())
        {
            String h = scanner.nextLine();
            s += h ;
        }
        s=s.toLowerCase();
        s = s.replace('?', '.');
        s = s.replace('!', '.');
        s = s.replaceAll("\\s+", " ");
        String[] tmp = s.split("\\.");
        for(String x : tmp)
        {
            x = x.toLowerCase().trim();
            StringBuilder k = new StringBuilder(x);
            k.setCharAt(0, Character.toUpperCase(k.charAt(0)));
            System.out.println(k);
        }
    }
    
}
