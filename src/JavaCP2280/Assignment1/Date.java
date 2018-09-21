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

    public Date(int month, int day, int year) {
        /**
         * Constructor
         *
         * @param month
         * @param day
         * @param year
         */
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void displayDate(){
        /**
         * displayDate
         * <p>Display the date in a m/d/y format.</p>
         */
        System.out.printf("%s/%s/%s",month, day, year);
    }
    public int getMonth() {
        /**
         * getMonth
         * @return month
         */
        return month;
    }

    public void setMonth(int month) {
        /**
         * setMonth
         * @param month
         */
        this.month = month;
    }

    public int getDay() {
        /**
         * getDay
         * @return day
         */
        return day;
    }

    public void setDay(int day) {
        /**
         * setDay
         * @param day
         */
        this.day = day;
    }

    public int getYear() {
        /**
         * getYear
         * @return year
         */
        return year;
    }

    public void setYear(int year) {
        /**
         * setYear
         * @param year
         */
        this.year = year;
    }

}
