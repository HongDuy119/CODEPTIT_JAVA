
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Set<String> setD =new TreeSet<>();
        for(int i =0 ; i<s.length() ; i++)
        {
            setD.add(String.valueOf(s.charAt(i)));
        }
        System.out.println(setD.size());
    }
    
}
