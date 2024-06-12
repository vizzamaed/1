package Controller;

import MFIUserValidation.model.Validation;
import MFIUserValidation.model.ValidateUserData;


public class UserValidation extends Validation implements ValidateUserData {

    public UserValidation(){
        System.out.println("Checking.");
    }
    
    @Override
    public void loading(Double amountInvested) throws InterruptedException {
        System.out.println("Please wait.");
        
        for (int counter = 1; counter <= 10; counter++) {
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println(); 
    }

    @Override
    public boolean isValidInvestmentAmount(Double amountInvested) throws InvalidInvestmentAmountInputException {
        if (amountInvested == null || amountInvested < 1000) {
            throw new InvalidInvestmentAmountInputException("Investment amount must be at least 1000.");
        }
        return true;
    }

    @Override
    public boolean isValidFundSelection(String fundId) throws InvalidFundSelectionException {
        if (fundId == null || fundId.isEmpty()) {
            throw new InvalidFundSelectionException("Fund ID cannot be null or empty.");
        }
        else{
            
        }
        
        return true;
    }

    @Override
    public boolean isValidInvestmentAmount(String amountInvested) {
        try {
           
            Double amount = Double.parseDouble(amountInvested.trim());

            return amount >= 1000;
        } catch (NumberFormatException e) {
            
            return false;
        }
    }
}
