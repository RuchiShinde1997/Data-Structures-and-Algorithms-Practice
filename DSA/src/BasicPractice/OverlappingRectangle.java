package BasicPractice;

import java.util.Scanner;

public class OverlappingRectangle {
    long calculateArea(int a, int b){
        return (long) a*b;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        OverlappingRectangle o = new OverlappingRectangle();
        while(t>0){
            int n = 2*t;
            while(n>0){
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                int x3 = sc.nextInt();
                int y3 = sc.nextInt();
                int x4 = sc.nextInt();
                int y4 = sc.nextInt();
                int x_int = Math.min(x2, x4) - Math.max(x1, x3);
                int y_int = Math.min(y2, y4) - Math.max(y1, y3);
                long area_int = 0L;
                if(x_int>0 && y_int>0)
                    area_int = o.calculateArea(x_int, y_int);
                long area1 = o.calculateArea(x2-x1, y2-y1);
                long area2 = o.calculateArea(x4-x3, y4-y3);
                System.out.println((area1+area2)-area_int);
                n-=2;
            }
            t--;
        }
    }
}
