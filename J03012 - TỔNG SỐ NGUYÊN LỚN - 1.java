
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
public class J03012 {
    static Scanner scanner = new Scanner(System.in);
    public static void solve(){
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        System.out.println(a.add(b));
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
