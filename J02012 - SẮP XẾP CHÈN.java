
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = scanner.nextInt();
        int[] a = new int[n+5];
        for(int i = 0 ; i< n ; i++)
        {
            a[i] = scanner.nextInt();
        }
        for(int i = 0 ;i<n ; i++)
        {
            System.out.printf("Buoc %d: ",i);
            numbers.add(a[i]);
            numbers.sort(Comparator.naturalOrder());
            for(int x : numbers)
            {
                System.out.printf("%d ",x);
            }
            System.out.println("");
        }
    }
    
}
