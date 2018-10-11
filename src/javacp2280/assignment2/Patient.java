package javacp2280.assignment2;

import java.time.LocalDate;
import java.time.Period;

/**
 * Patient class
 *
 * @author Carter Daly-MacPhail
 */
public class Patient {

    private String fName;
    private String lName;
    private int dobDay;
    private int dobMonth;
    private int dobYear;
    private double height;
    private double weight;

    /**
     * Patient Constructor
     *
     * @param fName    First name of patient
     * @param lName    Last name of patient
     * @param dobDay   Day of birth
     * @param dobMonth Month of birth
     * @param dobYear  Year of birth
     * @param height   Patient's height in inches
     * @param weight   Patient's weight in pounds
     */
    public Patient(String fName, String lName, int dobDay, int dobMonth, int dobYear, double height, double weight) {
        this.fName = fName;
        this.lName = lName;
        this.dobDay = dobDay;
        this.dobMonth = dobMonth;
        this.dobYear = dobYear;
        this.height = height;
        this.weight = weight;

    }

    /**
     * Get age in years
     *
     * @return
     */
    public int getAgeInYears() {
        LocalDate birthday = LocalDate.of(dobYear, dobMonth, dobDay);
        return (Period.between(birthday, LocalDate.now())).getYears();
    }

    /**
     * Get first name
     *
     * @return
     */
    public String getfName() {
        return fName;
    }

    /**
     * Set first name
     *
     * @param fName
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * Get last name
     *
     * @return
     */
    public String getlName() {
        return lName;
    }

    /**
     * Set last name
     *
     * @param lName
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * Get day of birth
     *
     * @return
     */
    public int getDobDay() {
        return dobDay;
    }

    /**
     * Set day of birth
     *
     * @param dobDay
     */
    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    /**
     * Get month of birth
     *
     * @return
     */
    public int getDobMonth() {
        return dobMonth;
    }

    /**
     * Set month of birth
     *
     * @param dobMonth
     */
    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    /**
     * Get year of birth
     *
     * @return
     */
    public int getDobYear() {
        return dobYear;
    }

    /**
     * Set year of birth
     *
     * @param dobYear
     */
    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }

    /**
     * Get height
     *
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set height
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get weight
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set weight
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

}
