package Arrays;

import com.sun.jdi.ThreadReference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    /*
    Using 2 pointer approach
    - Sort the array
    - Keep a pointer at ith index
    - Keep 2 pointers such that l=i+1 and r=n-1
    - Move l forward if the currentSum is less than target value and move the right pointer backward if the currentSum is greater than target value
     */

    public void threeSum(int[] arr, int targetValue){
        Arrays.sort(arr);
        Set<List<Integer>> output = new HashSet<>();
        int n = arr.length;
        for (int i=0; i<n; i++) {
            int l = i+1;
            int r = n - 1;
            while (l < r) {
                int currentSum = arr[i] + arr[l] + arr[r];
                if (currentSum == targetValue) {
                    System.out.println(arr[i] + "," + arr[l] + "," + arr[r]);
                    break;
                }
                else if (currentSum < targetValue)
                    l++;
                else
                    r--;
            }
        }
    }

    public static void main(String[] args){
        ThreeSum obj = new ThreeSum();
        int arr[] =  {1, 4, 45, 6, 10, 8};
        obj.threeSum(arr, 22);
    }
}
