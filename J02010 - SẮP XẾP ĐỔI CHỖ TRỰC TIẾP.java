
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02010_Sapxepdoichotructiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n+4];
        for(int i = 1 ; i<= n ; i++)
        {
            a[i] = scanner.nextInt();
        }
        for(int i = 1 ; i< n ; i++)
        {
            System.out.printf("Buoc %d: ",i);
            for(int j = i+1 ; j<= n ; j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            for(int j = 1; j <= n ; j++)
            {
                System.out.printf("%d ",a[j]);
            }
            System.out.println("");
        }
    }
}
