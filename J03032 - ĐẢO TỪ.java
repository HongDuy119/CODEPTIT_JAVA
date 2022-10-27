
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03032_Daotu {
    public static void dao_tu(String s)
    {
        String[] list = s.split("\\s++");
        for(String l : list)
        {
            StringBuilder str = new StringBuilder(l);
            System.out.print(str.reverse().toString()+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
//        System.out.println("");
        for(int i = 1 ; i <= Integer.parseInt(test) ; i++)
        {
            String s = scanner.nextLine();
            dao_tu(s);
            System.out.println("");
        }
    }
    
}
