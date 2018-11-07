package javacp2280.assignment4;

/**
 * Tester class for Huge Integer
 *
 * @author Carter Daly-MacPhail
 */
public class HugeIntegerTester {
    public static void main(String[] args) {
        String hugeIntString = "8632982749824926346239463928692";
        HugeInteger hugeInteger = new HugeInteger(hugeIntString);
        System.out.println(hugeInteger);
    }
}
