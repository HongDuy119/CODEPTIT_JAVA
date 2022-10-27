
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01013_Tongsouoc1 {
    public static long [] a = new long[2000006];
    public static long [] b = new long[2000006];
    public static void main(String[] args) {
        for(int i = 1 ; i<=2000000 ; i++)
        {
            a[i] = 1;
            b[i] = i;
        }
        a[0] = a[1] =0;
        for(int i =2 ; i<=2000000 ; i++)
        {
            if(a[i] ==1)
            {
                for(int j = i*2 ; j<=2000000 ; j += i)
                {
                    a[j]=0;
                    b[j] = i;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        long res = 0;
        int test = scanner.nextInt();
        for(int i = 1 ;i<=test ; i++)
        {
            int n = scanner.nextInt();
//            System.out.println(b[n]);
            while(n!=1)
            {
                res += b[n];
                n /= b[n];
            }
        }
        System.out.println(res);
        
    }
    
}
