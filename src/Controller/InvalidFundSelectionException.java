package Controller;
import java.io.IOException;
/**
 * Exception thrown when the fund selection is invalid.
 */
public class InvalidFundSelectionException extends IOException {
    public InvalidFundSelectionException(String message) {
        super(message);
    }
}
