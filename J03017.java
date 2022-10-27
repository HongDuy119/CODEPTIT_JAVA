import java.util.Scanner;


/**
 *
 * @author Hong Duy
 */
public class J03017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while(test-->0)
        {
            int max1 = -1000000;
            String s = scanner.nextLine();
            String k = s;
            int res = s.length();
            while(true)
            {
                k = "";
                res = s.length();
                k = s.replace("100", "");
                if(k.compareTo(s)==0)
                {
                    break;
                }
                s = k;
                max1 = Math.max(res-s.length(),max1);
            }
//            System.out.println(res-s.length());
            System.out.println(max1);
        }
    }
    
}