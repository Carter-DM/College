package javacp3561.assignment1.part1.main;

import java.util.LinkedList;
import java.util.List;

public class PrimeNumberCalculatorFaster extends PrimeNumberCalculator {

    /**
     * Determine if n is prime in O(sqrt(n))
     * @param n integer
     * @return true if prime, false if not
     */
    @Override
    public boolean isPrime(int n) {
        return (getLowestDivisor(n) == n);
    }

    /**
     * Get the unique factorization of n. If n is prime then the list is just itself.
     * @param n integer
     * @return List<Integer>
     */
    @Override
    public List<Integer> getUniquePrimeFactorization(int n) {
        List<Integer> primes = new LinkedList<>();
        if (isPrime(n)) {
            primes.add(n);
            return primes;
        }
        else {
            do {
                int lowestDiv = getLowestDivisor(n);
                primes.add(lowestDiv);
                n = n / lowestDiv;
            } while (n > 1);
        }
        return primes;
    }

    /**
     * Get the lowest divisor of n.
     * @param n integer
     * @return integer
     */
    private int getLowestDivisor(int n) {
        if (n < 1) {
            return 1;
        }
        else for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
