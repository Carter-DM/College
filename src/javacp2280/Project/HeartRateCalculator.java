package javacp2280.Project;

/**
 * HeartRateCalculator class
 *
 * @author Carter Daly-MacPhail
 */
public class HeartRateCalculator {
    public static final int MAX_HEART_LIMIT = 220;
    public static final double UPPER_HEART_LIMIT_PERCENTAGE = .85;
    public static final double LOWER_HEART_LIMIT_PERCENTAGE = .5;

    /**
     * getMaximumHeartRate
     * <p>Maximum heart rate is calculated as 220 minus the person's age in years.</p>
     *
     * @param age
     * @return
     */
    public static double getMaximumHeartRate(int age) {
        return MAX_HEART_LIMIT - age;
    }

    /**
     * getHeartRateUpperBound
     * <p>Heart rate target upper bound is calculated as 85% of the maximum heart rate.</p>
     *
     * @param maximumHeartRate
     * @return
     */
    public static double getHeartRateUpperBound(double maximumHeartRate){
        return maximumHeartRate * UPPER_HEART_LIMIT_PERCENTAGE;
    }

    /**
     * getHeartRateLowerBound
     * <p>Heart rate target lower bound is calculated as 50% of the maximum heart rate.</p>
     *
     * @param maximumHeartRate
     * @return
     */
    public static double getHeartRateLowerBound(double maximumHeartRate){
        return maximumHeartRate * LOWER_HEART_LIMIT_PERCENTAGE;

    }
}
