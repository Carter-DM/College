package javacp3561.assignment1.part1.main;

import java.util.List;

public class PrimeNumberCalculatorMain {

    /**
     * Main runner to test prime number calculator speeds. For individual method tests see the junit test cases
     * @param args
     */
    public static void main(String[] args) {
        int n = 23542567;
        PrimeNumberCalculatorFast primeNumberCalculatorFast = new PrimeNumberCalculatorFast();
        PrimeNumberCalculatorFaster primeNumberCalculatorFaster = new PrimeNumberCalculatorFaster();

        System.out.println("Running PrimeNumberCalculatorFast.getUniquePrimeFactorization() on " + n);
        long startFast = System.nanoTime();
        List<Integer> primesFast = primeNumberCalculatorFast.getUniquePrimeFactorization(n);
        long stopFast = System.nanoTime();
        long timeElapsedFast = stopFast - startFast;
        System.out.println("Prime factors for " + n + " are " + primesFast.toString());
        System.out.println("Computed in " + timeElapsedFast + " nanoseconds");

        System.out.println("\nRunning PrimeNumberCalculatorFaster.getUniquePrimeFactorization() on " + n);
        long startFaster = System.nanoTime();
        List<Integer> primesFaster = primeNumberCalculatorFaster.getUniquePrimeFactorization(n);
        long stopFaster = System.nanoTime();
        long timeElapsedFaster = stopFaster - startFaster;
        System.out.println("Prime factors for " + n + " are " + primesFast.toString());
        System.out.println("Computed in " + timeElapsedFaster + " nanoseconds");

    }
}
