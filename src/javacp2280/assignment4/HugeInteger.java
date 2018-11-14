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
        setToZero();
        this.charArray = parse(integerString);
    }

    /**
     * setToZero method
     *
     * <p>Initializes the character array to 40 zero chars.</p>
     */
    private void setToZero(){
        this.charArray = new char[40];
        for (int i = 0; i < this.charArray.length; i++){
            charArray[i] = 0;
        }
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
            if (isDigit(stringInteger.charAt(i))) {
                charArray[i] = stringInteger.charAt(i);
            }
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
