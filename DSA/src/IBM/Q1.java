package IBM;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Q1 {

    public static long dominatingXorPairs(List<Integer> arr) {
        // Write your code here
        long res = 0L;
        int[] bitArray = new int[32];
        int arrLen = arr.size();
        for(int i = 0; i < arrLen; i++)
        {
            int position = (int)(Math.log(arr.get(i)) /
                    Math.log(2));
            res += bitArray[position];
            bitArray[position]++;
        }

        System.out.println((long) arrLen * (arrLen - 1) / 2 - res);
        return (long) arrLen * (arrLen - 1) / 2 - res;
    }

    public static void main(String[] args){
        Q1 q1 = new Q1();
        Integer[] n = new Integer[] {1, 1, 5, 7};
        Q1.dominatingXorPairs(Arrays.asList(n));
    }
}
