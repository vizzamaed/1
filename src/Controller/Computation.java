/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import MFIUserValidation.model.MutualFund;
/**
 *
 * @author vizzamaed
 */
public class Computation extends MutualFund{


    @Override
    public double computeSalesLoad(Double amountInvested) {
        double salesLoadPercentage = getSalesLoadPercentage(amountInvested);
        double salesLoadAmount = amountInvested * salesLoadPercentage / 100;
        return salesLoadAmount;
    }

    @Override
    public double netAmountInvested(Double amountInvested) {
        double salesLoadAmount = computeSalesLoad(amountInvested); 
        double netAmountInvested = amountInvested - salesLoadAmount;
        return netAmountInvested;
    }
    
    

    @Override
    public double purchasedShares(Double amountInvested) {
       double netAmountInvested=netAmountInvested(amountInvested);
       double navps = fundSelection.navps;
       double totalSharesBought = netAmountInvested / navps;
       return totalSharesBought;
    }
    
    private static double getSalesLoadPercentage(double amount) {
        if (amount >= 1000 && amount <= 99999.99) {
            return 2.0;
        } else if (amount >= 100000 && amount <= 499999.99) {
            return 1.5;
        } else if (amount >= 500000 && amount <= 1999999.99) {
            return 1.0;
        } else {
            return 0.5;
        }
    }
    
}    

