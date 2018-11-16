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
     * <p>Takes String containing huge integer. Takes each char and inserts into the charArray</p>
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
     * add method
     *
     * @param hugeInteger2
     * @return
     */
    public char[] add(HugeInteger hugeInteger2) {
        char[] sum = new char[40];
        int carry = 0;
        char[] hugeInt1 = this.getCharArray();
        char[] hugeInt2 = hugeInteger2.getCharArray();
        for (int i = hugeInt1.length - 1; i >= 0; i--) {
            int tempSum = carry + Character.getNumericValue(hugeInt1[i]) + Character.getNumericValue(hugeInt2[i]);
            carry = tempSum / 10 % 10;
            sum[i] = Character.forDigit(tempSum % 10, 10);
        }
        return sum;
    }

    public char[] subtract(HugeInteger hugeInteger2) {
        char[] difference = new char[41];
        char[] hugeInt1;
        char[] hugeInt2;
        if (hugeInteger2.isGreaterThan(this)) {
            hugeInt1 = hugeInteger2.getCharArray();
            hugeInt2 = this.getCharArray();
            difference[0] = '-';
        } else {
            hugeInt1 = this.getCharArray();
            hugeInt2 = hugeInteger2.getCharArray();
        }
        for (int i = hugeInt1.length - 1; i >= 0; i--) {
            int temp = 0;
            if (hugeInt1[i] >= hugeInt2[i]) {
                temp = Character.getNumericValue(hugeInt1[i]) - Character.getNumericValue(hugeInt2[i]);
            } else {
                int j = i;
                while (j - 1 >= 0) {
                    if (hugeInt1[j - 1] == '0'){
                        hugeInt1[j-1] = '9';
                        j--;
                    }
                    else{
                        // TODO
                    }
                }
            }
        }
    }

    /**
     * isGreaterThan method
     * <p>Compares two HugeIntegers to determine if the first is greater than the second.</p>
     *
     * @param hugeInteger2
     * @return
     */
    public boolean isGreaterThan(HugeInteger hugeInteger2) {
        char[] hugeInt1 = this.getCharArray();
        char[] hugeInt2 = hugeInteger2.getCharArray();
        for (int i = 0; i < hugeInt1.length; i++) {
            if (hugeInt1[i] > hugeInt2[i]) {
                return true;
            }
            if (hugeInt1[i] < hugeInt2[i]) {
                return false;
            }
        }
        return false;
    }

    /**
     * getCharArray method
     *
     * @return
     */
    public char[] getCharArray() {
        return this.charArray;
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
