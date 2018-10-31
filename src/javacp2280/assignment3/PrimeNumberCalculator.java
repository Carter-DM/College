package javacp2280.assignment3;

/**
 * Prime Number Calculator class
 * <div>Contains a number of different prime number calculators.</div>
 *
 * @author Carter Daly-MacPhail
 */
public class PrimeNumberCalculator {

    /**
     * isPrime method
     * <p>Takes an integer and returns whether it's prime or not.</p>
     *
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * getUniquePrimeFactorization method
     * <p>Takes an integer and returns a String containing its prime factors.</p>
     *
     * @param num
     * @return
     */
    public static String getUniquePrimeFactorization(int num) {
        String factors = "";
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                factors += i + " ";
                num = num / i;
            }
        }
        if (num > 2) {
            factors += " ";
        }
        return factors;
    }

    /**
     * printPrimesBetweenNumbers method
     * <p>Takes an upper bound and a lower bound and returns a string containing
     * all prime numbers between them.</p>
     *
     * @param lowerBound
     * @param upperBound
     * @return
     */
    public static String printPrimesBetweenNumbers(int lowerBound, int upperBound){
        String primes = "";
        int displayCount = 0; // Counter used to print primes nicer
        for(int i = lowerBound; i < upperBound; i++){
            if (isPrime(i)){
                primes += i + " ";
                displayCount += 1;
            }
            if (displayCount == 10){
                displayCount = 0;
                primes += "\n";
            }
        }
        return primes;
    }
}
