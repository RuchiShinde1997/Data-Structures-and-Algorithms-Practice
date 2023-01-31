package Bitwise;

import java.util.Scanner;

public class CountSetBits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int N = sc.nextInt();
            int cnt = 0;
            while(N!=0){
                if((N&1) == 1)
                    cnt++;
                N=N>>1;
            }
            System.out.println(cnt);
            t--;
        }
    }

}
