
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J03024_Souuthe {
    public static void so_uu_the(String s){
        int deml=0,demc=0;
        for(int i=0 ; i<s.length() ; i++ )
        {
            if(s.charAt(i)<'0' || s.charAt(i)>'9') 
            {
                System.out.println("INVALID");
                return;
            }
            if(((int)s.charAt(i)-48)%2==0) demc++;
            else deml++;
        }
//        System.out.println(demc + " " + deml);
        if((s.length()%2==0 && demc>deml) || (s.length()%2!=0 && demc<deml))
            System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i=1 ; i<=test ; i++){
            String s = scanner.next();
            so_uu_the(s);
        }
    }
    
}
