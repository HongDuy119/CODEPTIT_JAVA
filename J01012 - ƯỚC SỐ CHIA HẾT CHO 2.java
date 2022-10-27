
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01012_Uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 0 ; i < test ; i++)
        {
            long res = 0;
            long n = scanner.nextLong();
            for(int j = 1 ; j<=Math.sqrt(n) ; j++)
            {
                if(n%j==0)
                {
                    if(j%2==0) res++;
                    if(n/j%2==0) res++;
                    if(j*j==n && j%2==0) res--;
                }
            }
            System.out.println(res);
            
        }
    }
    
}
