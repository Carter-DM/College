package javacp2280.assignment4;

import java.util.Arrays;

/**
 * Huge Integer class
 *
 * @author Carter Daly-MacPhail
 */
public class HugeInteger {
    public HugeInteger() {

    }

    public static char[] parse(String stringInteger) {
        char[] arrayInteger = new char[40];
        for (int i = 0; i < stringInteger.length(); i++) {
            arrayInteger[i] = stringInteger.charAt(i);
        }
        return arrayInteger;
    }
}
