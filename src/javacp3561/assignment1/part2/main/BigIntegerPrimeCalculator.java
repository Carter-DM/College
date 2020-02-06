package javacp3561.assignment1.part2.main;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class BigIntegerPrimeCalculator {

    /**
     * Determine if n is prime.
     * @param n BigInteger
     * @return boolean
     */
    public static boolean isPrime(BigInteger n) {
        return (getLowestDivisor(n).compareTo(n) == 0);
    }

    /**
     * Get the prime factors of BigInteger n.
     * @param n BigInteger
     * @return List<String>
     */
    public static List<String> getPrimeFactorization(BigInteger n) {
        List<String> primes = new LinkedList<>();
        if (isPrime(n)) {
            primes.add(n.toString());
            return primes;
        }
        else {
            do {
                BigInteger lowestDiv = getLowestDivisor(n);
                primes.add(lowestDiv.toString());
                n = n.divide(lowestDiv);
            } while (n.compareTo(BigInteger.ONE) >= 1);
        }
        return primes;
    }

    /**
     * Get the lowest divisor of n.
     * @param n BigInteger
     * @return BigInteger
     */
    private static BigInteger getLowestDivisor(BigInteger n) {
        BigInteger TWO = new BigInteger("2");
        BigInteger f = new BigInteger("3");

        // If n is less than or equal to 1 then return 1
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE;
        }
        // If n is divisible by two then return 2
        if (n.mod(TWO).equals(BigInteger.ZERO)) {
            return TWO;
        }
        // Loop until f * f is greater than or equal to n.
        while (f.multiply(f).compareTo(n) <= 0) {
            if (n.mod(f).equals(BigInteger.ZERO)) {
                return f;
            }
            else {
                f = f.add(TWO);
            }
        }
        return n;
    }
}
