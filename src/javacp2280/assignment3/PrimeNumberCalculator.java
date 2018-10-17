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


}
