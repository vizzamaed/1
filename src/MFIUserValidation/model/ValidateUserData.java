package MFIUserValidation.model;

import Controller.InvalidInvestmentAmountInputException;
import Controller.InvalidFundSelectionException;

public interface ValidateUserData {
    boolean isValidFundSelection(String fundId) throws InvalidFundSelectionException;
    boolean isValidInvestmentAmount(Double amountInvested) throws InvalidInvestmentAmountInputException;
}
