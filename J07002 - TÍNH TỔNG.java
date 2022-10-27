
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
public class J07002_Tinhtong {
    public static boolean check(String s)
    {
        for(int i= 0; i<s.length(); i++)
        {
            if(s.charAt(i)<'0' || s.charAt(i) > '9')
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.txt");
        Scanner scanner = new Scanner(file);
        long sum=0;
        while (scanner.hasNext()) {            
            String s = scanner.next();
            
            if(s.length() <= 9)
            {
                if(check(s))
                {
                    sum += Integer.parseInt(s);
                }
            }
        }
        System.out.println(sum);
    }
    
}
