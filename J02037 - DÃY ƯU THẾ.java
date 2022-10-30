
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test-->0)
        {
            String[] s = (scanner.nextLine().split("\\s+"));
//            System.out.println(s);
            int dem=0,demc=0,deml=0;
            for(String x : s)
            {
//                System.out.println(x);
                if(Integer.parseInt(x)%2==0)
                {
                    demc++;
                }
                else deml++;
                dem++;
            }
            if((dem%2==0 && demc>deml) || (dem%2==1 && deml>demc) ) System.out.println("YES");
//            else if(dem%2==1 && demc<deml) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
