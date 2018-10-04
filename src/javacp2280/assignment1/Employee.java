package javacp2280.assignment1;

/**
 * Employee class
 *
 * @author Carter Daly-MacPhail
 */
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     * @param monthlySalary
     */
    public Employee(String firstName, String lastName, double monthlySalary) {

        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary < 0) {
            System.out.println("Employee salary must be positive.");
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    /**
     * getFirstName
     *
     * @return firstName
     */
    public String getFirstName() {

        return firstName;
    }

    /**
     * setFirstName
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    /**
     * getLastName
     *
     * @return lastName
     */
    public String getLastName() {

        return lastName;
    }

    /**
     * setLastName
     *
     * @param lastName
     */
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    /**
     * getMonthlySalary
     *
     * @return monthlySalary
     */
    public double getMonthlySalary() {

        return monthlySalary;
    }

    /**
     * setMonthlySalary
     *
     * @param monthlySalary
     */
    public void setMonthlySalary(double monthlySalary) {

        this.monthlySalary = monthlySalary;
    }


}
