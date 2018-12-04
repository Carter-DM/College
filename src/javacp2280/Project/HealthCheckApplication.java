package javacp2280.Project;

import java.util.Scanner;

/**
 * HealthCheckApplication class
 *
 * @author Carter Daly-MacPhail
 */
public class HealthCheckApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter person's first name: ");
        String fName = in.nextLine();

        System.out.print("\nEnter person's last name: ");
        String lName = in.nextLine();

        System.out.println("\nEnter person's date of birth (D/M/Y): ");
        System.out.print("Day: ");
        int dobDay = in.nextInt();
        System.out.print("Month: ");
        int dobMonth = in.nextInt();
        System.out.print("Year: ");
        int dobYear = in.nextInt();

        System.out.println("Enter person's height in inches: ");
        double height = in.nextDouble();

        System.out.println("Enter person's weight in pounds: ");
        double weight = in.nextDouble();

        Person person = new Person(fName, lName, dobDay, dobMonth, dobYear, height, weight);
        printPersonHeartRate(person);
    }

    /**
     * printPersonHeartRate
     * <p>Prints the inputted Person's: Maximum Heart Rate, Heart Rate range and BMI.</p>
     * @param person
     */
    public static void printPersonHeartRate(Person person){
        double maximumHeartRate = HeartRateCalculator.getMaximumHeartRate(person.getAgeInYears());
        System.out.printf("\nPerson's maximum heart rate: %.2f bpm\nPerson's target heart rate range: %.2f bpm - %.2f bpm\n",
                maximumHeartRate,
                HeartRateCalculator.getHeartRateLowerBound(maximumHeartRate),
                HeartRateCalculator.getHeartRateUpperBound(maximumHeartRate));

        System.out.printf("\nPerson's BMI: %.2f\n",BMICalculator.getBMI(person.getHeight(), person.getWeight()));
    }
}
