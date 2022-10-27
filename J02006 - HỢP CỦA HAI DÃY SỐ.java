
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02006_Hopcuahaidayso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] array = new int[1000+5];
        for(int i=0 ; i<=1000 ; i++) array[i]=0;
        for(int i = 0 ; i < a ; i++)
        {
            array[scanner.nextInt()] = 1;
        }
        for(int i = 0 ; i < b ; i++)
        {
            int temporary = scanner.nextInt();
            array[temporary] =1;
        }
        for(int i = 0 ; i<=1000 ; i++)
        {
            if(array[i]==1) System.out.printf("%d ",i);
        }

        
    }
    
}
