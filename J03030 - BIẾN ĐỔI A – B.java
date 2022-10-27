
    import java.util.Scanner;

    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */

    /**
     *
     * @author Hong Duy
     */
    public class J03030_BiendoiA_B {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char[] a = scanner.next().toCharArray();
            int f[][] = new int[1000006][3];
            if(a[0]=='A')
            {
                f[0][1] = 0;
                f[0][2]=1;
            }
            else{
                f[0][1]=1;
                f[0][2]=0;
            }
            for(int i =1 ; i<a.length ; i++)
            {
                if(a[i]=='A')
                {
                    f[i][1] = Math.min(f[i-1][1] , f[i-1][2]+1);
                    f[i][2] = Math.min(f[i-1][1]+1, f[i-1][2]+1);
                }
                else{
                    f[i][1] = Math.min(f[i-1][1]+1 , f[i-1][2]+1);
                    f[i][2] = Math.min(f[i-1][1]+1, f[i-1][2]);
                }
            }
            System.out.println(f[a.length-1][1]);
        }

    }
