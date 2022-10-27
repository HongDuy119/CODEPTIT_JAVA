
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
public class J02017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        int[] a = new int[n+5];
        for(int i = 1 ; i<=n ; i++)
        {
            a[i] = scanner.nextInt();
        }
        for(int i = 1 ; i <= n ; i++)
        {
            if(stack.empty())
            {
                stack.push(a[i]);
            }
            else
            {
                int k = stack.peek();
                if((k+a[i])%2==0)
                {
                    stack.pop();
                }
                else
                    stack.push(a[i]);
            }
        }
        System.out.println(stack.size());
    }
    
}
