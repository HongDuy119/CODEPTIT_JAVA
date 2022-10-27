
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
public class J03039_Chiahet {
    static Scanner scanner = new Scanner(System.in);
    public static void solve(){
        String[] list = scanner.nextLine().split(" ");
        BigInteger a = new BigInteger(list[0],10);
        BigInteger b = new BigInteger(list[1],10);
        if(a.compareTo(b)==-1)
        {
            BigInteger c = a;
            a = b;
            b = c;
        }
        BigInteger c = a.divide(b);
        c = c.multiply(b);
        if(c.compareTo(a)!=-1) System.out.println("YES");
        else System.out.println("NO");   
    }
    public static void main(String[] args) {
        String test = scanner.nextLine();
        for(int i = 0 ; i<Integer.parseInt(test) ; i++)
        {
            solve();
        }
    }
    
}
