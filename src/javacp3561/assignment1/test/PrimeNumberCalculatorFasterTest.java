package javacp3561.assignment1.test;

import javacp3561.assignment1.main.PrimeNumberCalculatorFaster;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCalculatorFasterTest {

    PrimeNumberCalculatorFaster primesFast = new PrimeNumberCalculatorFaster();

    @Test
    void isPrime() {
        int n = 2;
        System.out.println("Is " + n + " prime? " + primesFast.isPrime(n));
        assertTrue(primesFast.isPrime(n));
    }

    @Test
    void isPrimeFalse() {
        int n = 12;
        System.out.println("Is " + n + " prime? " + primesFast.isPrime(n));
        assertFalse(primesFast.isPrime(n));
    }

    @Test
    void getUniquePrimeFactorization() {
        int n = 12;
        List<Integer> primes = new LinkedList<>();
        primes.add(2);
        primes.add(2);
        primes.add(3);
        System.out.println("The prime factors of " + n + " are " + primesFast.getUniquePrimeFactorization(n).toString());
        assertEquals(primes, primesFast.getUniquePrimeFactorization(n));
    }
}