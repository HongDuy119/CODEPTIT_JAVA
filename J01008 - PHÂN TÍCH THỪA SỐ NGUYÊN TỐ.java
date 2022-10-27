
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01008_Phantichthuasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i =1 ; i <= test ; i++){
            long n = scanner.nextLong();
            System.out.printf("Test %d: ",i);
            
            for(int j = 2 ; j<=Math.sqrt(n) ; j++)
            {
                int dem = 0;
                while(n%j==0)
                {
                    n /= j;
                    dem++;
                }
                if(dem>0) System.out.printf("%d(%d) ",j,dem);
            }
            if(n>1) System.out.printf("%d(1)",n);
            System.out.println("");
//            System.out.println(res);
        }
    }
    
}
