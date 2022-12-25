package QuestionSet2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumGreatness {
    public static int findMaximumGreatness(List<Integer> arr) {
        // Write your code here
        List<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        int count = 0;
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<sorted.size(); j++){
                if(sorted.get(j) != -1){
                    if(arr.get(i) < sorted.get(j)){
                        arr.set(i, sorted.get(j));
                        sorted.set(j, -1);
                        count ++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
        return count;

    }

    public static void main(String[] args){
        Integer[] a = new Integer[] {1, 2, 6, 3, 2, 1};
        MaximumGreatness.findMaximumGreatness(Arrays.asList(a));
    }
}
