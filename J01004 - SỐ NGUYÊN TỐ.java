
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01004_Songuyento {
    public static boolean snt(int n)
    {
        if(n<2) return false;
        else
            for(int i = 2 ; i <= Math.sqrt(n) ; i++)
            {
                if(n%i==0) return false;
            }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i=1 ; i<= test ; i++)
        {
            int n = scanner.nextInt();
            if(snt(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
