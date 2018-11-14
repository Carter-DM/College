package javacp2280.assignment4;


import static java.lang.Character.isDigit;

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
        this.charArray = getZeroArray();
        parse(integerString);
    }

    /**
     * getZeroArray method
     *
     * <p>Initializes the character array to 40 zero chars.</p>
     */
    private char[] getZeroArray() {
        charArray = new char[40];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = '0';
        }
        return charArray;
    }

    /**
     * parse method
     *
     * @param stringInteger
     * @return
     */
    public void parse(String stringInteger) {
        // stringInteger must contain less than 40 chars
        if (stringInteger.length() <= 40) {
            int charArrayIndex = this.charArray.length - 1;
            for (int i = stringInteger.length() - 1; i >= 0; i--) {
                if (isDigit(stringInteger.charAt(i))) {
                    this.charArray[charArrayIndex] = stringInteger.charAt(i);
                    charArrayIndex--;
                }
            }
        }
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
