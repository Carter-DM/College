package JavaCP2280.Assignment1;

/**
 * Simple tester for Employee class
 *
 * @author Carter Daly-MacPhail
 */
public class EmployeeTester {

    public static void main(String[] args) {
        Employee employee = new Employee("David", "Parsons", 3900.00);
        Employee employee2 = new Employee("Loren", "Brooks", 4650.00);

        printYearlySalary(employee, employee2);

        System.out.println("Salaries raised by 10%");
        employee.setMonthlySalary(employee.getMonthlySalary() * 1.1);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.1);

        printYearlySalary(employee, employee2);

    }

    private static void printYearlySalary(Employee employee, Employee employee2) {
        /**
         * printYearlySalary
         * <p>Prints yearly salary of both tester employees</p>
         *
         * @param employee
         * @param employee2
         */
        System.out.printf("Yearly salary for %s %s: $%.2f\nYearly salary for %s %s: $%.2f\n",
                employee.getFirstName(),
                employee.getLastName(),
                employee.getMonthlySalary() * 12,
                employee2.getFirstName(),
                employee2.getLastName(),
                employee2.getMonthlySalary() * 12);
    }
}
