package QuestionSet2;

public class ValidNumberPlate {
    public boolean[] solution(String[] plates) {
        boolean[] ans = new boolean[plates.length];

        for (int i = 0; i < plates.length; i++) {

            String[] plate = plates[i].split("");

            if (plate.length != 6) {
                ans[i] = false;
            } else if (!isAlphaNumeric(plates[i])) {
                ans[i] = false;
            } else {
                int numCount = 0;
                boolean isValid = true;
                for (int j = 0; j < plate.length; j++) {


                    // the string should contain minimum 2 numbers
                    if (plate[j].matches("[1-9]+")) {
                        numCount++;
                    }

                     if(j==0){
                    // string should not contain 0 and O check for 0 index
                    if (plate[j].equals("O") || plate[j].equals("0")) {
                        ans[i] = false;
                        isValid = false;
                        break;
                    }
                     }else{
                    if (plate[j].equals("O") || plate[j].equals("0")) {
                        ans[i] = false;
                        isValid = false;
                        break;
                    } else {
                        if (plate[j].equals(plate[j - 1])) { // to check if string contains dupicate entry next to each other
                            ans[i] = false;
                            isValid = false;
                            break;
                        }
                    }
                     }

                }

                if (numCount > 1 && isValid) { // finally if string contains atleast 2 numbers
                    ans[i] = true;
                }

            }
        }
        return ans;
    }

    public static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[A-Z0-9]*$");
    }

    public static void main(String[] args) {
        ValidNumberPlate s = new ValidNumberPlate();
        String[] plates = {"A1O89C"};
        s.solution(plates);

    }
}
