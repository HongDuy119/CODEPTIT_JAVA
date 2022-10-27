
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
public class J03016 {
    static Scanner scanner = new Scanner(System.in);
    public static void solve(){
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger("11");
        BigInteger c = a.divide(b);
        if(c.multiply(b).compareTo(a)==0) System.out.println("1");
        else System.out.println("0");
    }
    public static void main(String[] args) {
        int test = scanner.nextInt();
        while(test>0)
        {
            solve();
            test--;
        }
    }
    
}
