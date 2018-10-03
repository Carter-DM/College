package JavaCP2280.InClass;

import java.util.Random;

/**
 * Loops class. For experimentation
 *
 * @author Carter Daly-MacPhail
 */

public class Loops {
    public static void main(String[] args) {
        /**
         * Main method
         */
        System.out.println(getRandomInt(100));
    }

    private static int getRandomInt(int bound){
        /**
         * getRandomInt method
         * <p>Returns random integer.</p>
         * @param bound
         */
        Random random = new Random();
        return random.nextInt(bound);
    }
}
