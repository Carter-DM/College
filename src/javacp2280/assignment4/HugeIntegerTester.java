package javacp2280.assignment4;

/**
 * Tester class for Huge Integer
 *
 * @author Carter Daly-MacPhail
 */
public class HugeIntegerTester {
    public static void main(String[] args) {
        String hugeIntString1 = "8646239463928692";
        String hugeIntString2 = "98673057857857857856";
        HugeInteger hugeInteger1 = new HugeInteger(hugeIntString1);
        HugeInteger hugeInteger2 = new HugeInteger(hugeIntString2);

        System.out.println("Expected: 98681704097321786548");
        System.out.println(hugeInteger1.add(hugeInteger2));

        System.out.println("Expected: false");
        System.out.println(hugeInteger1.isEqualTo(hugeInteger2));

        System.out.println("Expected: false");
        System.out.println(hugeInteger1.isGreaterThan(hugeInteger2));

        System.out.println("Expected: true");
        System.out.println(hugeInteger1.isLessThan(hugeInteger2));
    }
}
