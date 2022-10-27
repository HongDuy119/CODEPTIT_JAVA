
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03009 {
    static Scanner scanner = new Scanner(System.in);
    public static void solve(){
        String[] s1 = scanner.nextLine().trim().split("\\s+");
        String[] s2 = scanner.nextLine().trim().split("\\s+");
        Set<String> seta = new TreeSet<>();
        Set<String> setb = new TreeSet<>();
//        seta.addAll(s1);
        seta.addAll(Arrays.asList(s1));
        setb.addAll(Arrays.asList(s2));
        for(String S : seta)
        {
            if(setb.contains(S)==false)
            {
                System.out.print(S+" ");
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int test = Integer.parseInt(scanner.nextLine());
        while(test>0)
        {
            solve();
            test--;
        }
        
    }
    
}
