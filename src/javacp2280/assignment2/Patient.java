package javacp2280.assignment2;

import java.time.LocalDate;
import java.util.Date;

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

    /**
     * Patient Constructor
     *
     * @param fName First name of patient
     * @param lName Last name of patient
     * @param dobDay Day of birth
     * @param dobMonth Month of birth
     * @param dobYear Year of birth
     */
    public Patient(String fName, String lName, int dobDay, int dobMonth, int dobYear) {
        this.fName = fName;
        this.lName = lName;
        this.dobDay = dobDay;
        this.dobMonth = dobMonth;
        this.dobYear = dobYear;
    }

    /**
     * Get age in years
     * @return
     */
    public int getAgeInYears(){
        Date today = new Date();
        return today.getYear() - dobYear;
    }

    /**
     * Get first name
     * @return
     */
    public String getfName() {
        return fName;
    }

    /**
     * Set first name
     * @param fName
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * Get last name
     * @return
     */
    public String getlName() {
        return lName;
    }

    /**
     * Set last name
     * @param lName
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * Get day of birth
     * @return
     */
    public int getDobDay() {
        return dobDay;
    }

    /**
     * Set day of birth
     * @param dobDay
     */
    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    /**
     * Get month of birth
     * @return
     */
    public int getDobMonth() {
        return dobMonth;
    }

    /**
     * Set month of birth
     * @param dobMonth
     */
    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    /**
     * Get year of birth
     * @return
     */
    public int getDobYear() {
        return dobYear;
    }

    /**
     * Set year of birth
     * @param dobYear
     */
    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }

}
