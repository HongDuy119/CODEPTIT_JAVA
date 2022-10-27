
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03025_Xaudoixung {
    public static void xau_doi_xung(String s)
    {
        int dem = 0;
        for(int i = 0 ; i< s.length() ; i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
            {
                dem++;
            }
        }
        if( (s.length()%2!=0 && dem/2<=1) || (s.length()%2==0 && dem/2==1)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ; i<=test ; i++)
        {
            String s = scanner.next();
            xau_doi_xung(s);
        }
    }
    
}
