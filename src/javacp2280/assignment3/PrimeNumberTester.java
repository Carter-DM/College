package javacp2280.assignment3;

import java.util.Scanner;

/**
 * Tester class for Prime Number Calculator
 *
 * @author Carter Daly-MacPhail
 */
public class PrimeNumberTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("\n=======================================================");
            printMainMenu();
            userInput = in.next();

            if (userInput.equals("1")) {
                selectedIsPrime(in);
            } else if (userInput.equals("2")) {
                selectedUniquePrimeFactorization(in);
            } else if (userInput.equals("3")) {
                selectedGetPrimesBetweenTwoNumbers(in);
            } else if (userInput.equals("4")) {
                selectedPrintPrimesUpTo10000();
            } else if (!userInput.equals("x")){
                System.out.println("Invalid input.");
            }

        } while (!userInput.equalsIgnoreCase("x"));
    }

    private static void printMainMenu() {
        System.out.println("Enter the corresponding key below to access one" +
                " of the following options:\n" +
                "[1] Determine if a number is prime.\n" +
                "[2] Get the unique prime factorization of a number.\n" +
                "[3] Print all prime numbers between two numbers.\n" +
                "[4] Print all prime numbers up to 10,000.\n" +
                "[x] Quit");
    }

    private static void selectedIsPrime(Scanner in) {
        System.out.println("===================\n" +
                "IS NUMBER A PRIME?\n" +
                "===================\n" +
                "Enter an integer:");
        if (PrimeNumberCalculator.isPrime(in.nextInt())) {
            System.out.println("Yes, the number you entered is prime!");
        } else {
            System.out.println("No, the number you entered is not prime.");
        }
    }

    private static void selectedUniquePrimeFactorization(Scanner in) {
        System.out.println("===================\n" +
                "GET PRIME FACTORS\n" +
                "===================\n" +
                "Enter an integer:");
        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(in.nextInt()));
    }

    private static void selectedGetPrimesBetweenTwoNumbers(Scanner in) {
        System.out.println("===================\n" +
                "GET PRIMES BETWEEN BOUNDS\n" +
                "===================\n" +
                "Enter lower bound (integer):");
        int lowerBound = in.nextInt();
        System.out.println("Enter upper bound (integer):");
        int upperBound = in.nextInt();
        System.out.println(PrimeNumberCalculator.printPrimesBetweenNumbers(lowerBound, upperBound));
    }

    private static void selectedPrintPrimesUpTo10000() {
        System.out.println("===================\n" +
                "PRIMES UP TO 10,000\n" +
                "===================\n");
        System.out.println(PrimeNumberCalculator.printPrimesBetweenNumbers(0, 10000));
    }
}
