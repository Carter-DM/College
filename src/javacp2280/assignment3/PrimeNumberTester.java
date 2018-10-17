package javacp2280.assignment3;

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

        System.out.println(PrimeNumberCalculator.getUniquePrimeFactorization(9));
    }
}
