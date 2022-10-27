
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = scanner.nextInt();
        int[] a = new int[n+5];
        for(int i = 0 ; i< n ; i++)
        {
            a[i] = scanner.nextInt();
        }
        int s = 1;
        while(true)
        {
            int kq = 0;
            for(int i = 0 ; i< n-1 ; i++)
            {
                if(a[i]>a[i+1])
                {
                    kq = 1;
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            if(kq==0) break;
            System.out.printf("Buoc %d: ",s);
            for(int i = 0 ; i< n ; i++)
            {
                System.out.printf("%d ",a[i]);
            }
            System.out.println("");
            s++;
        }
    }
}
