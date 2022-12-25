package QuestionSet2;

import java.util.ArrayList;
import java.util.List;

public class DriversDiscount {

    public String[] solution(String[] driversArray) {
        // write your code in Java 11
        List<Driver> driversList = createDrivers(driversArray);
        String[] finalResult = new String[driversArray.length];
        int count = 0;
        for(Driver d : driversList){
            String driverName = d.getDriverName();
            int driverAge = d.getDriverAge();
            int mileageFrom6MonthsPrior = d.getMileageFrom6MonthsPrior();
            int cuurentMileage = d.getCuurentMileage();
            int monthsSinceLastAccident = d.getMonthsSinceLastAccident();
            boolean safetyCourseTaken = d.getSafetyCourseTaken();
            StringBuilder res = new StringBuilder();
            String defensiveDriver = "false";
            String acceidentFree = "false";
            String lowMileage = "false";
            String seniorDiscount = "false";
            int yearlyMileageAvg = (mileageFrom6MonthsPrior*6+cuurentMileage*6)/12;;
            if(driverAge > 55){
                seniorDiscount = "true";
            }
            if(safetyCourseTaken && driverAge>= 25){
                defensiveDriver = "true";
            }
            if(monthsSinceLastAccident > 0) {
                if (monthsSinceLastAccident > 5 * 12) {
                    acceidentFree = "true";
                }
            }

            if(yearlyMileageAvg < 5000){
                lowMileage = "true";
            }

            res.append(driverName).append(",").append(defensiveDriver).append(",").append(acceidentFree).append(",").append(lowMileage).append(",").append(seniorDiscount);
            finalResult[count] = String.valueOf(res);
            count++;
        }
        return finalResult;
    }

    List<Driver> createDrivers(String[] driversArray){
        List<Driver> drivers = new ArrayList<Driver>();
        for (String driverString: driversArray) {
            String[] splitDriver = driverString.split(",");
            drivers.add(new Driver(splitDriver));
        }
        return drivers;
    }

    public static void main(String[] args){
        String[] arr = new String[]{"Betty,29,3,3423,-1,TRUE"};
        DriversDiscount s = new DriversDiscount();

        System.out.println(s.solution(arr)[0]);
    }
    
}

class Driver{

    private String driverName;
    private String driverAge;
    private String mileageFrom6MonthsPrior;
    private String cuurentMileage;
    private String monthsSinceLastAccident;
    private String safetyCourseTaken;

    public Driver(String[] splitDriver) {
        this.driverName = splitDriver[0];
        this.driverAge = splitDriver[1];
        this.mileageFrom6MonthsPrior = splitDriver[2];
        this.cuurentMileage = splitDriver[3];
        this.monthsSinceLastAccident = splitDriver[4];
        this.safetyCourseTaken = splitDriver[5];
    }

    public String getDriverName(){
        return this.driverName;
    }

    public int getDriverAge() {
        return Integer.parseInt(this.driverAge);
    }

    public int getMileageFrom6MonthsPrior() {
        if("".equals(this.mileageFrom6MonthsPrior))
            return  0;
        if("-1".equals(this.mileageFrom6MonthsPrior))
            return  -1;
        return Integer.parseInt(this.mileageFrom6MonthsPrior);
    }

    public int getCuurentMileage() {
        return Integer.parseInt(this.cuurentMileage);
    }

    public int getMonthsSinceLastAccident() {
        return Integer.parseInt(this.monthsSinceLastAccident);
    }

    public boolean getSafetyCourseTaken() {
        return Boolean.parseBoolean(this.safetyCourseTaken);
    }

}

