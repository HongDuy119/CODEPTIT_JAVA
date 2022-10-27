
import java.util.Scanner;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J08022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-->0)
        {
            int n = scanner.nextInt();
            long[] a = new long[n+1];
            for(int i =1 ; i<=n ; i++)
            {
                a[i] = scanner.nextLong();
            }
            Stack<Long> st = new Stack<>();
            for(int i = n ; i>= 1 ; i--)
            {
                long tmp = a[i];
                while(!st.empty() && a[i]>=st.peek()) st.pop();
                if(st.empty()) a[i] = -1;
                else a[i] = st.peek();
                st.push(tmp);
            }
            for(int i= 1 ; i<=n ; i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println("");
        }
    }
    
}
