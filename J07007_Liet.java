
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hong Duy
 */
public class J07007_Liet {
    private static class WordSet{
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Hong Duy\\OneDrive\\Máy tính\\IT\\Java\\JAVA_CODE_PTIT\\src\\DATA.txt");
        Scanner scanner = new Scanner(file);
        Set<String> setD = new TreeSet<String>();
        while(scanner.hasNext())
        {
            String n = scanner.next();
            n = n.toLowerCase();
            setD.add(n);
        }
        String[] a = new String[10004];
        int s = 0;
        for(String l : setD)
        {
            System.out.println(l);
        }
    }
    
}
