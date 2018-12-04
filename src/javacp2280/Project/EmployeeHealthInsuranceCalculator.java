package javacp2280.Project;

/**
 * EmployeeHealthInsuranceCalculator class
 *
 * @author Carter Daly-MacPhail
 */
public class EmployeeHealthInsuranceCalculator {
    public static final double BMI_OVER_25 = .75;
    public static final double BMI_OVER_30 = 1.5;
    public static final double EXCEEDED_HEART_RATE_LIMIT = .5;

    public static double getAnnualHealthInsuranceCost(double salary, double BMI, double heartRate, double maxHeartRate) {
        double annualInsurance = 0;
        annualInsurance += salary * .01;
        if (BMI > 30) {
            annualInsurance += annualInsurance * BMI_OVER_30;
        } else if (BMI > 25) {
            annualInsurance += annualInsurance * BMI_OVER_25;
        }
        if (heartRate > maxHeartRate){
            annualInsurance += annualInsurance * EXCEEDED_HEART_RATE_LIMIT;
        }
        return annualInsurance;
    }

}
