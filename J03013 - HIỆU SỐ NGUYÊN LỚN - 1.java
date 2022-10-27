
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03013_Hieusonguyenlon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ; i<=test ; i++)
        {
//           String a = scanner.nextLine();
//            String b = scanner.nextLine();
            BigInteger a = new BigInteger(scanner.next(),10);
            BigInteger b = new BigInteger(scanner.next(),10);
            BigInteger sub = a.subtract(b).abs();
            String s=sub.toString();
            String c = a.toString();
            String d = b.toString();
            while(s.length()<Math.max(c.length(), d.length()))
            {
                s = "0"+s;
            }
            System.out.println(s);
        }
                
    }
    
}
