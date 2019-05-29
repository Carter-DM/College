package javacp2560.assignment2;

/**
 * InvalidShapeParameterException class extends Exception
 *
 * @author Carter Dsly-MacPhail
 */
public class InvalidShapeParameterException extends Exception {
    private static final String MSG = "Shape parameter is not valid!";

    public InvalidShapeParameterException() {
        super(MSG);
    }
}
