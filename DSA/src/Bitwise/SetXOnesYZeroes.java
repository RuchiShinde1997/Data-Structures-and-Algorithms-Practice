package Bitwise;

public class SetXOnesYZeroes {

    public static void main(String[] args) {
        int t = 1;
        while(t>0){
            int x = 1;
            int y = 15;
            if(x!=0 || y!=0){
                long ans = (long) (((1<<x)-1)<<y)%1000000007L;
                System.out.println(ans);
            }
            else{
                System.out.println(x);
            }

            t--;
        }
    }
}
