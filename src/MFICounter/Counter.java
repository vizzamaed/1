package MFICounter;

import MFIReader.Reader;
import Controller.UserValidation;
import Controller.InvalidFundSelectionException;
import Controller.InvalidInvestmentAmountInputException;
import Controller.fundSelection;
import java.io.IOException;
import Controller.Computation;


public class Counter {
    static {
        System.out.println("Welcome to Manual Funding Investment");
    }

    public static void main(String[] args) throws IOException, InterruptedException, InvalidInvestmentAmountInputException, InvalidFundSelectionException {
        boolean continueProcess = true;

        do {
            System.out.println();
            String investorName = Reader.readString("Investor Name");
            String fundId = fundSelection.getFundSelection();
            double navps = fundSelection.navps;
            Double amountInvested = Reader.readDouble("Investing Amount");

            UserValidation user = new UserValidation();
            user.loading(amountInvested);

            if (user.isValidInvestmentAmount(amountInvested)) {
                if (user.isValidFundSelection(fundId)) {
                    Computation computation = new Computation();
                    double salesLoadAmount = computation.computeSalesLoad(amountInvested);
                    double netAmountInvested = computation.netAmountInvested(amountInvested);
                    double totalSharesBought = computation.purchasedShares(amountInvested);
                    System.out.println("Investor Name is " + investorName);
                    System.out.println("Investment Fund Type is " + fundId);
                    System.out.println("Amount invested is " + amountInvested);
                    System.out.println("NAVPS: " + navps +"(as of June 11,2024)");
                    System.out.println("Sales Load Amount: " + salesLoadAmount);
                    System.out.println("Net Amount Invested: " + netAmountInvested);
                    System.out.println("Total Shares Bought: " + totalSharesBought);
                } else {
                    System.err.println("Invalid Fund Selection");
                }
            } else {
                System.err.println("Insufficient amount.");
            }

            String continueChoice = Reader.readChar("Do you want to continue? (Y/N)");
            continueProcess = continueChoice.equalsIgnoreCase("Y");

        } while (continueProcess);

        System.out.println("\nThank you for investing.");
    }
}
