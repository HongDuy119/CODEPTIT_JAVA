
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03010 {
    public static String xu_ly(String s)
    {
        String[] k = s.toLowerCase().trim().split("\\s+");
        String res = k[k.length-1];
        for(int i=0 ; i<k.length-1 ; i++)
        {
            res += k[i].charAt(0);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        String[] s = new String[test+5];
        int i=0;
        while(test-->0)
        {
            s[i] = xu_ly(scanner.nextLine());
            i++;
        }
        for(int j=0 ; j<i ; j++)
        {
            int dem = 0;
            for(int k =0 ; k<j ; k++)
            {
                if(s[j].compareTo(s[k])==0)
                {
                    dem++;
                }
            }
            if(dem>0)
            {
                System.out.print(s[j]);
                System.out.print(dem+1);
                System.out.println("@ptit.edu.vn");
            }
            else
            {
                System.out.println(s[j]+"@ptit.edu.vn");
            }
        }
        
    }
    
}
