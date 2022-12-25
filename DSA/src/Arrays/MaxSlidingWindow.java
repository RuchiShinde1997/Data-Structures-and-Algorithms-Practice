package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSlidingWindow {

    public List maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int max = 0;
        for(int i=0; i<=n-k; i++){
            int j=i;
            List<Integer> subarr = new ArrayList<>();
            while(j<i+k){
                subarr.add(nums[j]);
                j++;
            }
            if(!subarr.isEmpty())
                if(Collections.max(subarr) > max) {
                    max = Collections.max(subarr);
                    result.add(max);
                }
        }
        return result;
    }

    public static void main(String[] args){
        MaxSlidingWindow obj = new MaxSlidingWindow();
        int[] arr = {1,3,-1,-3,5,3,6,7};
        List res = obj.maxSlidingWindow(arr, 3);
        System.out.println(res);
    }
}
