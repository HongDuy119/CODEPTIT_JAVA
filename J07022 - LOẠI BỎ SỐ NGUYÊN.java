
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J07022 {
    public static boolean check(String s)
    {
        for(int i =0 ; i< s.length() ; i++)
        {
            if(s.charAt(i)<'0' || s.charAt(i)>'9') 
                return true;
        }
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner scanner = new Scanner(file);
        String[] a = new String[10005];
        int s1=0;
        while(scanner.hasNext())
        {
            String s = scanner.next();
            if(s.length()<=9)
            {
                if(check(s)) 
                {
                    a[s1] = s;
                    s1++;
                }
            }
            else
            {
                a[s1] = s;
                s1++;
            }
        }
        for(int i =0 ; i<s1 ; i++)
        {
            for(int j = i+1 ; j<s1 ; j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0 ; i<s1 ; i++)
        {
            System.out.printf("%s ",a[i]);
        }
    }
}
