package javacp3561.assignment1.main;

import java.util.List;

public abstract class PrimeNumberCalculator {

    /**
     * Determine if n is prime
     * @param n integer
     * @return true if prime, false if not
     */
    public abstract boolean isPrime(int n);

    /**
     * Get the unique factorization of n. If n is prime then the list is just itself.
     * @param n integer
     * @return
     */
    public abstract List<Integer> getUniquePrimeFactorization(int n);
}
