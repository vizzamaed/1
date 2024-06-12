package MFIUserValidation.model;

import Controller.InvalidInvestmentAmountInputException;
import Controller.InvalidFundSelectionException;


public abstract class Validation {
    
    public abstract void loading(Double amountInvested) throws InterruptedException;
    public abstract boolean isValidFundSelection(String fundId) throws InvalidFundSelectionException;
    public abstract boolean isValidInvestmentAmount(String amountInvested) throws InvalidInvestmentAmountInputException;
   
}
