package Bitwise;

public class SumOfXORs {

    public static int checkBit(int N, int i){
        return (N & (1<<i));
    }
    public static void main(String[] args){
        int[] arr = {10, 12, 5, 7};
        int N = arr.length;
        int ans=0;
        for(int i=0; i<31; i++){
            int setBits = 0;
            for(int j=0; j<N; j++){
                if(SumOfXORs.checkBit(arr[j], i) != 0)
                {
                    setBits++;
                }
            }
            int unsetBits = N-setBits;
            ans = ans + (setBits*(unsetBits)*(1<<i));
        }
        System.out.println((2*(ans)));
    }
}
