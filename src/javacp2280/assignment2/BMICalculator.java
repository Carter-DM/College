package javacp2280.assignment2;

/**
 * BMICalculator Class
 *
 * @author Carter Daly-MacPhail
 */
public class BMICalculator {

    /**
     * getBMI
     * <p>BMI is calculated as (Weight [in pounds] * 703) / Height [in inches] ^ 2</p>
     *
     * @param height
     * @param weight
     * @return
     */
    public static double getBMI(double height, double weight){
        return (weight * 703) / (height * height);
    }
}
