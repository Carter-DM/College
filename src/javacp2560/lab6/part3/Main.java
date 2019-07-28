package javacp2560.lab6.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static final int N = 26;
    public static void main(String[] args) {
        List<Integer> binary = convertToBinaryTheHarderWay(N);
        System.out.print("Binary representation of " + N + ": ");
        for(Integer i : binary){
            System.out.print(i);
        }
        System.out.println("\nNumber of 1's: " + howManyOnes(binary));
    }

    public static List<Integer> convertToBinaryTheHarderWay(int n) {
        List<Integer> binary = new ArrayList<>();
            while (n > 0) {
                binary.add(n % 2);
                n = n / 2;
            }
        Collections.reverse(binary);
        return binary;
    }

    public static String convertToBinaryTheEasierWay(int n) {
        return Integer.toBinaryString(n);
    }

    public static int howManyOnes(List<Integer> binary) {
        int total = 0;
        for (Integer i : binary) {
            if (i == 1) {
                total++;
            }
        }
        return total;
    }
}
