import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J02007_Demsolanxuathien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i =1 ; i<= test;i++)
        {
            int[] a= new int[100005] ,b = new int[100005];
            for(int j= 1 ; j<=100004 ; j++) b[j]=0;
            int n = scanner.nextInt();
            for(int j =1 ; j <=n ; j++)
            {
                a[j] = scanner.nextInt();
                b[a[j]]++;
            }
            System.out.printf("Test %d:\n",i);
            for(int j=1 ; j <= n ; j++)
            {
                if(b[a[j]]>0)
                {
                    System.out.printf("%d xuat hien %d lan\n",a[j],b[a[j]]);
                    b[a[j]]=0;
                }
            }
        }
    }
    
}