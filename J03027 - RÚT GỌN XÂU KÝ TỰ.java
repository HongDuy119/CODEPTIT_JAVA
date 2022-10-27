
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
public class J03027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++)
        {
            if(st.empty())
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(s.charAt(i)==st.peek()) st.pop();
                else 
                    st.push(s.charAt(i));
            }
        }
        if(st.empty()) System.out.println("Empty String");
        else 
            for(Character auto : st)
            {
                System.out.print(auto);
            }
    }
    
}
