package QuestionSet2;

import java.util.*;

public class ApplicationManager {

    public static List<String> getOpenApplications(List<String> commands) {
        // Write your code here
        List<String> result = new ArrayList<>();

        for(int k=0; k<commands.size(); k++){

            String com = commands.get(k);
            String[] commandArr = com.split(" ");
                String op = commandArr[0];
            String type = "";
                if(commandArr.length > 1) {
                    type = commandArr[1];
                }

                switch(op){
                    case "open":
                        result.add(type);
                        break;
                    case "close":
                        int noOfTabs = Integer.parseInt(type);
                        int i = result.size()-1;
                        int count = 0;
                        if(!result.isEmpty()){
                            while(noOfTabs !=0 && noOfTabs<=i){
                                if(!result.isEmpty()) {
                                    result.remove(i);
                                    i--;
                                    noOfTabs--;
                                }
                            }
                        }
                    break;
                    case "clear":
                        if(!result.isEmpty()){
                            result.subList(0, result.size()).clear();
                        }
                        break;
                }
            }


        return result;
    }

    public static void main(String[] args)  {
        String[] commands = new String[] {
                "open firefox",
                "open curl",
                "open terminal",
               "close 2",
                "open ps"};
        List<String> c = Arrays.asList(commands);
        ApplicationManager.getOpenApplications(c);

    }
}
