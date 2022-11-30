package Arrays;

import java.util.*;

public class MinSwapsToSortAnArray {

    public void minSwaps(int[] arr){
        int[] posMap = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(posMap);
        int minReqdSwaps = 0;
        for(int i=0; i<arr.length; i++){
            int pos =  Arrays.binarySearch(posMap, arr[i]);
            if( pos != i){
                swap(arr, i, pos);
                minReqdSwaps++;
            }
        }
        System.out.println(minReqdSwaps);
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int []a = {1, 5, 4, 3, 2};
        MinSwapsToSortAnArray obj = new MinSwapsToSortAnArray();
        obj.minSwaps(a);
    }
}
