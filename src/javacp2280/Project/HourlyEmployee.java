package javacp2280.Project;

public class HourlyEmployee extends Employee {
    private double hourlyWage;

    /**
     * Person Constructor
     *
     * @param fName      First name of person
     * @param lName      Last name of person
     * @param dobDay     Day of birth
     * @param dobMonth   Month of birth
     * @param dobYear    Year of birth
     * @param height     Persons height in inches
     * @param weight     Persons weight in pounds
     * @param hourlyWage Employees hourly wage
     */
    public HourlyEmployee(String fName, String lName, int dobDay, int dobMonth, int dobYear, double height, double weight, double hourlyWage) {
        super(fName, lName, dobDay, dobMonth, dobYear, height, weight);
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double getAnnualWage() {
        return this.hourlyWage * 40 * 52;
    }
}
