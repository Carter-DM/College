package javacp2280.assignment4;


/**
 * Huge Integer class
 *
 * @author Carter Daly-MacPhail
 */
public class HugeInteger {
    private char[] charArray;

    /**
     * HugeInteger constructor
     *
     * @param integerString
     */
    public HugeInteger(String integerString) {
        this.charArray = parse(integerString);
    }

    /**
     * parse method
     *
     * @param stringInteger
     * @return
     */
    public char[] parse(String stringInteger) {
        char[] charArray = new char[40];
        for (int i = 0; i < stringInteger.length(); i++) {
            charArray[i] = stringInteger.charAt(i);
        }
        return charArray;
    }

    /**
     * toString method
     *
     * @return
     */
    public String toString() {
        return String.valueOf(this.charArray);
    }
}
