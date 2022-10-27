
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01014_Uocsonguyentolon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i =0 ; i < test ; i++){
            long n = scanner.nextLong();
            long res = n;
            for(int j = 2 ; j<=Math.sqrt(n) ; j++)
            {
                while(n%j==0)
                {
                    n /= j;
                    res = j;
                }
            }
            if(n>0) res=n;
            System.out.println(res);
        }
    }
    
}
