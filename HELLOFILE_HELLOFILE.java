
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
public class HELLOFILE_HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Hello.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext())
        {
            String w = scanner.next();
            System.out.println(w);
        }
    } 
    
}
