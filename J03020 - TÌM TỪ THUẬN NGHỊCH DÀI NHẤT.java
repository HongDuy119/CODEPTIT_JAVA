
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03020_Timtuthuannghichdainhat {
    public static boolean xau_doi_xung(String s)
    {
        for(int i = 0 ; i< s.length() ; i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] res = new String[10005];
        int maxn = -1000;
        int s = 0;
        while(scanner.hasNext())
        {
            String str = scanner.next();
            if(xau_doi_xung(str))
            {
                res[s]=str;
                maxn = Math.max(res[s].length(), maxn);
                s++;
            }
        }
        for(int i =0 ; i<s ; i++)
        {
            if(res[i].length() ==maxn)
            {
                int dem = 1;
                for(int j = i+1 ; j<s ; j++)
                {
                    if(res[i].compareTo(res[j])==0)
                    {
                        dem++;
                        res[j]="";
                    }
                }
                System.out.printf("%s %d\n",res[i],dem);
            }
                
        }
    }
    
}
