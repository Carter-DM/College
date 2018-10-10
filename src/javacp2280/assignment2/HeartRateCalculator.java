package javacp2280.assignment2;

/**
 * HeartRateCalculator class
 *
 * @author Carter Daly-MacPhail
 */
public class HeartRateCalculator {

    /**
     * getMaximumHeartRate
     * @param age
     * @return
     */
    public static double[] getMaximumHeartRate(int age){
        double[] heartRateArray = new double[3];
        heartRateArray[0] = 220 - age;
        heartRateArray[1] = heartRateArray[0] * .5;
        heartRateArray[2] = heartRateArray[0] * .85;
        return heartRateArray;
    }
}
