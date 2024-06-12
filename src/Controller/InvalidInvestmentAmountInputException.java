package Controller;
import java.io.IOException;
/**
 * Exception thrown when the investment amount input is invalid.
 */
public class InvalidInvestmentAmountInputException extends IOException {
    public InvalidInvestmentAmountInputException(String message) {
        super(message);
    }
}
