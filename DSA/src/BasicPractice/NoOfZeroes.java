package BasicPractice;

import java.util.Scanner;

public class NoOfZeroes {
    long factorial(int n){
        long fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        NoOfZeroes s = new NoOfZeroes();
        int t = 1;
        while (t > 0) {
            long n = 1000000000000000L;

            // Initialize result
            long count = 0;

            // Keep dividing n by powers
            // of 5 and update count
            for (long i = 5L; n / i >= 1; i *= 5L)
                count += n / i;

            System.out.println(count);
            t--;
        }
    }
}
