package javacp2280.Project;

/**
 * EmployeeHealthInsuranceCalculator class
 *
 * @author Carter Daly-MacPhail
 */
public class EmployeeHealthInsuranceCalculator {
    public static final double BMI_OVER_25 = 1.75;
    public static final double BMI_OVER_30 = 2.5;
    public static final double EXCEEDED_HEART_RATE_LIMIT = 1.5;

    /**
     * getAnnualHealthInsuranceCost
     *
     * @param salary
     * @param BMI
     * @param heartRate
     * @param heartRateUpperBound
     * @return
     */
    public static double getAnnualHealthInsuranceCost(double salary, double BMI, double heartRate, double heartRateUpperBound) {
        double annualInsurance = 0;
        annualInsurance += salary * .01;
        if (BMI > 30) {
            annualInsurance *= BMI_OVER_30;
        } else if (BMI > 25) {
            annualInsurance *= BMI_OVER_25;
        }
        if (heartRate > heartRateUpperBound) {
            annualInsurance *= EXCEEDED_HEART_RATE_LIMIT;
        }
        return annualInsurance;
    }

}
