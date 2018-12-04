package javacp2280.Project;

/**
 * Employee abstract class
 *
 * @author Carter Daly-MacPhail
 */
public abstract class Employee extends Person {

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
     */
    public Employee(String fName, String lName, int dobDay, int dobMonth, int dobYear, double height, double weight) {
        super(fName, lName, dobDay, dobMonth, dobYear, height, weight);
    }

    /**
     * getAnnualWage abstract method
     * @return
     */
    public abstract double getAnnualWage();
}
