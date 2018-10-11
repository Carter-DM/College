package javacp2280.assignment2;

/**
 * HeartRateCalculator class
 *
 * @author Carter Daly-MacPhail
 */
public class HeartRateCalculator {

    /**
     * getMaximumHeartRate
     * <p>Maximum heart rate is calculated as 220 minus the person's age in years.</p>
     *
     * @param age
     * @return
     */
    public static double getMaximumHeartRate(int age) {
        return 220 - age;
    }

    /**
     * getHeartRateUpperBound
     * <p>Heart rate target upper bound is calculated as 85% of the maximum heart rate.</p>
     *
     * @param maximumHeartRate
     * @return
     */
    public static double getHeartRateUpperBound(double maximumHeartRate){
        return maximumHeartRate * .85;
    }

    /**
     * getHeartRateLowerBound
     * <p>Heart rate target lower bound is calculated as 50% of the maximum heart rate.</p>
     *
     * @param maximumHeartRate
     * @return
     */
    public static double getHeartRateLowerBound(double maximumHeartRate){
        return maximumHeartRate * .5;

    }
}
