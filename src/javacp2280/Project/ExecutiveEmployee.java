package javacp2280.Project;

public class ExecutiveEmployee extends Employee {
    private double salary;
    private double bonus;

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
     * @param salary     Employees annual salary
     * @param bonus      Employees executive bonus
     */
    public ExecutiveEmployee(String fName, String lName, int dobDay, int dobMonth, int dobYear, double height, double weight, double salary, double bonus) {
        super(fName, lName, dobDay, dobMonth, dobYear, height, weight);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double getAnnualWage() {
        return salary + bonus;
    }
}
