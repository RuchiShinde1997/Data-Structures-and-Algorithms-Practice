package QuestionsSet1;

public class ReverseNumber {

    public void solution(int num){
        int rem = 0;
        int rev = 0;
        while(num != 0){
            rem = num%10;
            num = num/10;
            rev = rev*10 + rem;
        }
        System.out.print(rev);

    }

    public static void main(String[] args){
        ReverseNumber rev = new ReverseNumber();
        rev.solution(100);
        System.out.println();
        rev.solution(3456);

    }
}
