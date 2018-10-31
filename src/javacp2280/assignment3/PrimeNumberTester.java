package javacp2280.assignment3;

import java.util.Scanner;

/**
 *Tester class for Prime Number Calculator
 *
 * @author Carter Daly-MacPhail
 */
public class PrimeNumberTester {

    public static void main(String[] args) {
        System.out.println("Should be true: "+PrimeNumberCalculator.isPrime(5));
        System.out.println("Should be true: "+PrimeNumberCalculator.isPrime(2));
        System.out.println("Should be true: "+PrimeNumberCalculator.isPrime(3));
        System.out.println("Should be true: "+PrimeNumberCalculator.isPrime(7));
        System.out.println("Should be false: "+PrimeNumberCalculator.isPrime(1));
        System.out.println("Should be false: "+PrimeNumberCalculator.isPrime(10));
        System.out.println("Should be false: "+PrimeNumberCalculator.isPrime(9));
        System.out.println("Should be true: "+PrimeNumberCalculator.isPrime(19));
        System.out.println("Should be false: "+PrimeNumberCalculator.isPrime(240));

        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(25));


        System.out.println(PrimeNumberCalculator.printPrimesBetweenNumbers(0, 10000));

        Scanner in = new Scanner(System.in);
        String userInput = "";
        do {
            System.out.println("\n\n=======================================================");
            System.out.println("Enter the corresponding key below to access one" +
                    " of the following options:\n" +
                    "[1] Determine if a number is prime.\n" +
                    "[2] Get the unique prime factorization of a number.\n" +
                    "[3] Print all prime numbers between two numbers.\n" +
                    "[4] Print all prime numbers up to 10,000.\n" +
                    "[x] Quit");
            userInput = in.next();
        }while(!userInput.equalsIgnoreCase("x"));
    }
}
