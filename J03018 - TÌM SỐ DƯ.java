package code_ptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void solve(int test)
    {
        while(test-->0)
        {
            String s = scanner.nextLine();
            int k;
            if (s.length()==1) k = Integer.parseInt(s);
            else{
                k = Integer.parseInt(s.substring(s.length()-2));
            }
            if(k%4==0) System.out.println("4");
            else System.out.println("0");
        }
    }
    public static void main(String[] args) {
       int test = Integer.parseInt(scanner.nextLine());
       solve(test);
    }
}
