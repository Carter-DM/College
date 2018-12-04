package javacp2280.Project;

/**
 * BMICalculator Class
 *
 * @author Carter Daly-MacPhail
 */
public class BMICalculator {
    public static final int BMICONST = 703;

    /**
     * getBMI
     * <p>BMI is calculated as (Weight [in pounds] * 703) / Height [in inches] ^ 2</p>
     *
     * @param height
     * @param weight
     * @return
     */
    public static double getBMI(double height, double weight){
        return (weight * BMICONST) / (height * height);
    }
}
