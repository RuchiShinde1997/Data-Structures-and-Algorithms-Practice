package QuestionsSet1;

public class LongestSquareFromCutSticks {

    public int solution(int A, int B) {
        return (A/4) + (B/4);
    }

        public static void main (String[] args){
            LongestSquareFromCutSticks s = new LongestSquareFromCutSticks();
            int r = s.solution(11, 13);
            System.out.println(r);
        }
    }

