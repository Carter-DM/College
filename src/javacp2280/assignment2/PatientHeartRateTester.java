package javacp2280.assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * PatientHeartRateTester class
 *
 * @author Carter Daly-MacPhail
 */
public class PatientHeartRateTester {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter patient's first name: ");
            String fName = in.nextLine();

            System.out.print("\nEnter patient's last name: ");
            String lName = in.nextLine();

            System.out.println("\nEnter patient's date of birth (D/M/Y): ");
            System.out.print("Day: ");
            int dobDay = in.nextInt();
            System.out.print("Month: ");
            int dobMonth = in.nextInt();
            System.out.print("Year: ");
            int dobYear = in.nextInt();


            Patient patient = new Patient(fName, lName, dobDay, dobMonth, dobYear);
            System.out.printf("\nPatient name: %s %s\nPatient date of birth (D/M/Y): %d/%d/%d\nPatient age: %s years\n",
                    patient.getfName(),
                    patient.getlName(),
                    patient.getDobDay(),
                    patient.getDobMonth(),
                    patient.getDobYear(),
                    patient.getAgeInYears()
            );

        } catch (InputMismatchException e) {
            System.out.println("\nNames must be Strings and dates must be integers!");
        }
    }
}
