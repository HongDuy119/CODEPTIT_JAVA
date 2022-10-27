
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test-->0)
        {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            if(a.compareTo(b)==0) System.out.println("-1");
            else{
                System.out.println(Math.max(a.length(), b.length()));
            }
        }
    }
    
}
