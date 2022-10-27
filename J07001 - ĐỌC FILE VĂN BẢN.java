
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
public class J07001_DocFILEvanban {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Hong Duy\\OneDrive\\Máy tính\\IT\\Java\\JAVA_CODE_PTIT\\src\\Data.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
    
}
