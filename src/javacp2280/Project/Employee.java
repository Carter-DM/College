package javacp2280.Project;

public abstract class Employee extends Person {

    private double hourlyWage;

    /**
     * Person Constructor
     *
     * @param fName    First name of person
     * @param lName    Last name of person
     * @param dobDay   Day of birth
     * @param dobMonth Month of birth
     * @param dobYear  Year of birth
     * @param height   Persons height in inches
     * @param weight   Persons weight in pounds
     * @param hourlyWage
     */
    public Employee(String fName, String lName, int dobDay, int dobMonth, int dobYear, double height, double weight, double hourlyWage) {
        super(fName, lName, dobDay, dobMonth, dobYear, height, weight);
        this.hourlyWage = hourlyWage;
    }

    public double getAnnualWage(){
        return hourlyWage * 40 * 52;
    }
}
