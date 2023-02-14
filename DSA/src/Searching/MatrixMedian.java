package Searching;

import java.util.Arrays;

public class MatrixMedian {

    public int findMedian(int[][] A) {

        int n = A.length;
        int m = A[0].length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(min > A[i][0])
                min = A[i][0];

            if(max < A[i][m-1])
                max = A[i][m-1];
        }

        int reqdIdx = (n*m + 1)/2;
        while(min<max){
            int mid = (max + min)/2;
            int position = 0, idx = 0;

            for(int i=0; i<n; i++){
               idx = Arrays.binarySearch(A[i], mid);
               if(idx<0)
                   idx = Math.abs(idx) - 1;
               else{
                   while(idx<m && A[i][idx]==mid){
                       idx++;
                   }
               }
                position+=idx;
            }
            if(position < reqdIdx)
                min = mid+1;
            else
                max = mid;
        }
        return min;

    }

    public static void main(String[] args){
        int[][] A = new int[][] {{1,3,5}, {2,6,9}, {3,6,9}};
        MatrixMedian sol = new MatrixMedian();
        int ans = sol.findMedian(A);
        System.out.println(ans);
    }
}
