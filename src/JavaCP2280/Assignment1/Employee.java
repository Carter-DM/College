package JavaCP2280.Assignment1;

/**
 * Employee class
 *
 * @author Carter Daly-MacPhail
 */
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        /**
         * Constructor
         *
         * @param firstName
         * @param lastName
         * @param monthlySalary
         */
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Monthly salary must be positive.");
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName() {
        /**
         * getFirstName
         * @return firstName
         */
        return firstName;
    }

    public void setFirstName(String firstName) {
        /**
         * setFirstName
         * @param firstName
         */
        this.firstName = firstName;
    }

    public String getLastName() {
        /**
         * getLastName
         * @return lastName
         */
        return lastName;
    }

    public void setLastName(String lastName) {
        /**
         * setLastName
         * @param lastName
         */
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        /**
         * getMonthlySalary
         * @return monthlySalary
         */
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        /**
         * setMonthlySalary
         * @param monthlySalary
         */
        this.monthlySalary = monthlySalary;
    }


}
