
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J01010_Catdoi {
    public static boolean cat_doi(String s)
    {
        for(int i = 0 ; i< s.length() ; i++)
        {
            if(s.codePointAt(i) != '0' && s.codePointAt(i)!='1' && s.codePointAt(i)!='8' && s.codePointAt(i)!='9')
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 1 ;i<=test ; i++)
        {
            String s = scanner.next();
            s = s.replace('8', '0');
            s = s.replace('9', '0');
            if(cat_doi(s))
            {
                String duy="";
                int kq=0;
                for(int j=0 ; j<s.length() ; j++)
                {
                    if((char)s.codePointAt(j) > '0')
                    {
//                        System.out.println(s.codePointAt(j));
                        kq = 1;
                    }
                    if(kq==1)
                    {
                        duy += (char)s.charAt(j);
                    }
                }
                if("".equals(duy)) System.out.println("INVALID");
                else System.out.println(duy);
            }
            else System.out.println("INVALID");
        }
    }
}
