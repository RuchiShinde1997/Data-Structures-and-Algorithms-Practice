package QuestionsSet1;

/*
Longest substring such that no three consecutive characters are same
Eg. Input: str = “baaabbabbb”
Output: 7
“aabbabb” is the required substring.
Input: str = “babba”
Output: 5
Given string itself is the longest substring.
 */

public class LongestSubstringWithout3CharsRepeat {

    public int solution(String S){
        int occurrences = 2;
        int result = 2;

        for(int i=0; i<S.length()-2; i++){
            if(S.charAt(i) != S.charAt(i+1) || S.charAt(i+1) != S.charAt(i+2)){
                occurrences++;
            }
            else {
                result = Math.max(result, occurrences);
                occurrences = 2;
            }
        }
        result = Math.max(result, occurrences);
        return result;
    }

    public static void main(String[] args){
        LongestSubstringWithout3CharsRepeat obj = new LongestSubstringWithout3CharsRepeat();
        int res = obj.solution("baaabbabbb");
        System.out.println(res);
    }
}
