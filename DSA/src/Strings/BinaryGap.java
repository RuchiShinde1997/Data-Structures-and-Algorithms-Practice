package Strings;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    void binaryGap(int N){
        String s = Integer.toBinaryString(N);
        char[] chArr = s.toCharArray();
        int maxDist = 0;
        int start = 0, end=0;
        List<Integer> ones = new ArrayList<>();
        for(int i=0; i<chArr.length; i++){
            if(chArr[i] == '1'){
                ones.add(i);
            }
        }
        for(int i=0; i<ones.size()-1; i++){
            maxDist = Math.max(maxDist, ones.get(i+1) - ones.get(i));
        }

        System.out.println(maxDist);
    }

    public static void main(String[] args){
        BinaryGap sol = new BinaryGap();
        sol.binaryGap(100000100);
    }
}
