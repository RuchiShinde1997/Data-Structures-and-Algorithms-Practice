package BasicPractice;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class LCMAndHCF {
    int hcf(int a, int b){
        int temp1 = Math.min(a,b);
        int temp2 = Math.max(a,b);
        int temp;
        while(temp2 != 0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        return temp1;
    }

    long lcm(int a, int b, int hcf){
        System.out.println("a: "+a);
        long product = (long) a *b; System.out.println("b: "+b);

        System.out.println("prod: "+product);
        long ans = product/hcf;
        System.out.println("lcm: "+ans);
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        LCMAndHCF s = new LCMAndHCF();
            int a = 605904;
            int b = 996510762;
            int h = s.hcf(a, b);
            long l = s.lcm(a, b, h);

            System.out.print(l+" "+h);


    }
}
