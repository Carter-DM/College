package javacp3561.assignment1.part2.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class BigIntegerMain {

    /**
     * Main runner to test BigInteger calculator.
     * @param args
     */
    public static void main(String[] args) {
        try {
            final int N = 50;
            File file = new File("src\\javacp3561\\assignment1\\part2\\main\\BigIntegerTextOut.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("");

            for (int i = 1; i <= N; i++) {
                // Remove comma at the end
                if (i == N) {
                    writer.append(bigIntegerPower(i).toString());
                    break;
                }
                writer.append(bigIntegerPower(i).toString() + ",\n");
            }

            file.createNewFile();
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        final String BIGINT = "1125899906842624";

        BigInteger bigInteger = new BigInteger(BIGINT);
        System.out.println("The prime factorization of " + bigInteger.toString() + " is " + BigIntegerPrimeCalculator.getPrimeFactorization(new BigInteger(BIGINT)));
    }

    static BigInteger bigIntegerPower(int n) {
        BigInteger bigInt = new BigInteger("2");
        return bigInt.pow(n);
    }
}
