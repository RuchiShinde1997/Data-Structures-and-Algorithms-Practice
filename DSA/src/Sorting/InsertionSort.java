package Sorting;

public class InsertionSort {

    void insertionSort(int[] arr, int n){
        for(int i=1; i<n; i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            System.out.print(j+" ");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InsertionSort s = new InsertionSort();
        int t = 1;
        while(t-- > 0){
            int n = 8;
            int[] arr = new int[] {176, -272 ,-272 ,-45, 269, -327, -945, 176};
            s.insertionSort(arr, n);
            System.out.println();
        }
    }
}
