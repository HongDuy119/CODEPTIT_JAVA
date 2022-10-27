
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03010_Diachiemail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  test = scanner.nextLine();
        for(int i = 0 ; i< Integer.parseInt(test); i++)
        {
            String[] list = new String(scanner.nextLine()).trim().split("\\s+");
//            System.out.println(list.length);
            for(int j=0 ; j < list.length; j++)
            {
                list[j] = list[j].toLowerCase();
            }
            String res="";
            res = res+ list[list.length-1];
            for(int j = 0 ; j<list.length-1 ; j++)
            {
                res = res+ String.valueOf(list[j].charAt(0));
            }
            Map<String,Integer> map = new HashMap<String,Integer>;
            map.put
        }
    }
    
}
