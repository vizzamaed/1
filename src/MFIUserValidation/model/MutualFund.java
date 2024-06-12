/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MFIUserValidation.model;

/**
 *
 * @author vizzamaed
 */
public abstract class MutualFund {
    public abstract double computeSalesLoad(Double amountInvested); 
    public abstract double netAmountInvested(Double amountInvested); 
    public abstract double purchasedShares(Double amountInvested);
}
