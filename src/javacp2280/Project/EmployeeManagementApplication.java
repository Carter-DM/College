package javacp2280.Project;

import java.util.Random;
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
        Random random = new Random();
        do {
            System.out.println("\n=======================================================");
            printMainMenu();
            userInput = in.nextLine();

            if (userInput.equals("1")) {
                System.out.println("Which type of employee do you wish to create?:");
                System.out.println("[1] Hourly Employee\n[2] Salaried Employee\n[3] Executive Employee");
                String employeeType = in.nextLine();
                Employee inputEmployee = inputEmployeeInfo(in, employeeType);
                printEmployee(inputEmployee);
                System.out.println("Enter heart rate: ");
                double heartRate = in.nextDouble();
                System.out.printf("Heart rate: %.1f\n", heartRate);
                System.out.println("Monthly insurance premium: " + getMonthlyInsurancePremium(inputEmployee, heartRate));

            } else if (userInput.equals("2")) {
                double heartRate = 30 + (220 - 30 + 1) * random.nextDouble();
                Employee randEMployee = RandomGenerator.getRandomEmployee();
                printEmployee(randEMployee);
                System.out.printf("Heart rate: %.1f\n", heartRate);
                System.out.println("Monthly insurance premium: " + getMonthlyInsurancePremium(randEMployee, heartRate));

            } else if (userInput.equals("3")) {
                Employee[] company = RandomGenerator.getRandomCompany(10);
                for (int i = 0; i < company.length; i++) {
                    printEmployee(company[i]);
                    double heartRate = 30 + (220 - 30 + 1) * random.nextDouble();
                    System.out.printf("Heart rate: %.1f\n", heartRate);
                    System.out.println("Monthly insurance premium: " + getMonthlyInsurancePremium(company[i], heartRate));
                }
            } else if (!userInput.equals("x")) {
                System.out.println("Invalid input.");
            }
        } while (!userInput.equals("x"));

    }

    private static void printMainMenu() {
        System.out.println("Enter the corresponding key below to access one" +
                " of the following options:\n" +
                "[1] Get insurance premium for new employee. (input)\n" +
                "[2] Generate random employee.\n" +
                "[3] Generate company.\n" +
                "[x] Quit");
    }

    private static Employee inputEmployeeInfo(Scanner in, String typeOfEmployee) {
        System.out.println("Enter first name: ");
        String fName = in.nextLine();
        System.out.println("Enter last name: ");
        String lName = in.nextLine();
        System.out.println("Enter date of birth D/M/Y: ");
        int dobDay = in.nextInt();
        int dobMonth = in.nextInt();
        int dobYear = in.nextInt();
        System.out.println("Enter height in inches: ");
        double height = in.nextDouble();
        System.out.println("Enter weight in lbs: ");
        double weight = in.nextDouble();
        if (typeOfEmployee.equals("1")) {
            System.out.println("Enter hourly wage: ");
            double hourlyWage = in.nextDouble();
            System.out.println("Enter weekly hours worked: ");
            double hoursPerWeek = in.nextDouble();
            return new HourlyEmployee(fName, lName, dobDay, dobMonth, dobYear, height, weight, hourlyWage, hoursPerWeek);
        } else if (typeOfEmployee.equals("2")) {
            System.out.println("Enter annual salary: ");
            double salary = in.nextDouble();
            return new SalariedEmployee(fName, lName, dobDay, dobMonth, dobYear, height, weight, salary);
        } else {
            System.out.println("Enter annual salary: ");
            double salary = in.nextDouble();
            System.out.println("Enter annual bonus: ");
            double bonus = in.nextDouble();
            return new ExecutiveEmployee(fName, lName, dobDay, dobMonth, dobYear, height, weight, salary, bonus);
        }
    }

    public static void printEmployee(Employee employee) {
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
