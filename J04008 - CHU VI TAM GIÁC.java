
package code_ptit;

import java.util.Scanner;


class Point{
    double x;
    double y;
    public Point(){
        
    }
    public void nhap(Scanner sc){
        x = sc.nextDouble();
        y = sc.nextDouble();
    }
    public double distance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point();
            Point b = new Point();
            Point c = new Point();
            a.nhap(sc);
            b.nhap(sc);
            c.nhap(sc);
            double x = a.distance(b);
            double y = b.distance(c);
            double z = c.distance(a);
            if(x+y<=z || y+z<=x || z+x<=y){
                System.out.print("INVALID");
            }
            else{
                System.out.printf("%.3f",(x+y+z));
            }
            System.out.println("");
        }
    }
}
