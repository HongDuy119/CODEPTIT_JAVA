
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J08024_So0vaSo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int j = 1 ; j <= test ; j++)
        {
            Queue<Long> number = new LinkedList<>();
            number.add(Long.valueOf(9));
            int n = scanner.nextInt();
            while (true) {                
                if(number.peek()%n==0)
                {
                    System.out.println(number.peek());
                    break;
                }
                else
                {
                    long k = number.poll();
                    number.add(k*10+0);
                    number.add(k*10+9);
                }
                    
            }
            
        }
        
    }
    
}
