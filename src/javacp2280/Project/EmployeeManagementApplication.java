package javacp2280.Project;

import java.util.Scanner;

/**
 * EmployeeManagementApplication class
 *
 * @author Carter Daly-MacPhail
 */
public class EmployeeManagementApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput;

        /*
        do {
            userInput = in.nextLine();
        } while (!userInput.equals("x"));
        */

        Employee randEmp = RandomGenerator.getRandomEmployee();
        printEmployee(randEmp);

    }

    public static void printEmployee(Employee employee){
        System.out.printf("\nEmployee name: %s %s\nEmployee date of birth (D/M/Y): %d/%d/%d\nEmployee age: %s years\nEmployee height: %.1fin\nEmployee weight: %.1flbs\nEmployee annual wage: $%.2f\n",
                employee.getfName(),
                employee.getlName(),
                employee.getDobDay(),
                employee.getDobMonth(),
                employee.getDobYear(),
                employee.getAgeInYears(),
                employee.getHeight(),
                employee.getWeight(),
                employee.getAnnualWage()
        );
    }
    /**
     * getMonthlyInsurancePremium method
     * <p>Returns result from EmployeeHealthInsuranceCalculator.getAnnualHealthInsuranceCost / 12</p>
     *
     * @param employee
     * @param heartRate
     * @return
     */
    public static double getMonthlyInsurancePremium(Employee employee, double heartRate) {
        return EmployeeHealthInsuranceCalculator.getAnnualHealthInsuranceCost(
                employee.getAnnualWage(),
                getBMI(employee),
                heartRate,
                getEmployeeMaxHeartRate(employee)
        ) / 12;
    }

    /**
     * getBMI method
     * <p>Returns result from BMICalculator.getBMI</p>
     *
     * @param employee
     * @return
     */
    public static double getBMI(Employee employee) {
        return BMICalculator.getBMI(employee.getHeight(), employee.getWeight());
    }

    /**
     * getEmployeeMaxHeartRate method
     * <p>Returns result from HeartRateCalculator.getHeartRateUpperBound</p>
     *
     * @param employee
     * @return
     */
    public static double getEmployeeMaxHeartRate(Employee employee) {
        return HeartRateCalculator.getHeartRateUpperBound(
                HeartRateCalculator.getMaximumHeartRate(employee.getAgeInYears())
        );
    }
}
