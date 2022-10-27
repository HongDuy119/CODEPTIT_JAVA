
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
public class J07004_Sokhac {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner scanner = new Scanner(file);
        int a[] = new int[1005];
        for(int i =0 ; i<=1000 ;i++) a[i]=0;
        while(scanner.hasNext())
        {
            int n = scanner.nextInt();
            a[n]++;
        }
        for(int i= 0 ; i<=1000 ; i++)
        {
            if(a[i]>0) System.out.printf("%d %d\n",i,a[i]);
        }
    }
    
}
