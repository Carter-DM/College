package JavaCP2280.Assignment1;

/**
 * Date class
 *
 * @author Carter Daly-MacPhail
 */
public class Date {

    private int month;
    private int day;
    private int year;

    /**
     * Constructor
     *
     * @param month
     * @param day
     * @param year
     */
    public Date(int month, int day, int year) {

        this.month = month;
        this.day = day;
        this.year = year;
    }

    /**
     * displayDate
     * <p>Display the date in a m/d/y format.</p>
     */
    public void displayDate() {

        System.out.printf("%s/%s/%s", month, day, year);
    }

    /**
     * getMonth
     *
     * @return month
     */
    public int getMonth() {

        return month;
    }

    /**
     * setMonth
     *
     * @param month
     */
    public void setMonth(int month) {

        this.month = month;
    }

    /**
     * getDay
     *
     * @return day
     */
    public int getDay() {

        return day;
    }

    /**
     * setDay
     *
     * @param day
     */
    public void setDay(int day) {

        this.day = day;
    }

    /**
     * getYear
     *
     * @return year
     */
    public int getYear() {

        return year;
    }

    /**
     * setYear
     *
     * @param year
     */
    public void setYear(int year) {

        this.year = year;
    }

}
