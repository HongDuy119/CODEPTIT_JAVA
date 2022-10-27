
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01016_Chuso4vachuso7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int dem=0;
        for(int i = 0 ; i<s.length() ; i++)
        {
            if(s.codePointAt(i) == '4' || s.codePointAt(i) == '7')
            {
                dem++;
            }
        }
        if(dem==4 || dem == 7)
            System.out.println("YES");
        else System.out.println("NO");
            
      }    
}
