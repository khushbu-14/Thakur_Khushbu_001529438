/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author khushbu
 */
public class Checking {
    // bank checking
 private String checkingBankName;
 private String checkingBankRoutingNumber;
 private String checkingBankAccountNumber;
 private String checkingAccountBalance;
 private boolean isCheckingAccountType;

    public String getCheckingBankName() {
        return checkingBankName;
    }

    public void setCheckingBankName(String checkingBankName) {
        this.checkingBankName = checkingBankName;
    }

    public String getCheckingBankRoutingNumber() {
        return checkingBankRoutingNumber;
    }

    public void setCheckingBankRoutingNumber(String checkingBankRoutingNumber) {
        this.checkingBankRoutingNumber = checkingBankRoutingNumber;
    }

    public String getCheckingBankAccountNumber() {
        return checkingBankAccountNumber;
    }

    public void setCheckingBankAccountNumber(String checkingBankAccountNumber) {
        this.checkingBankAccountNumber = checkingBankAccountNumber;
    }

    public String getCheckingAccountBalance() {
        return checkingAccountBalance;
    }

    public void setCheckingAccountBalance(String checkingAccountBalance) {
        this.checkingAccountBalance = checkingAccountBalance;
    }

    public boolean isIsCheckingAccountType() {
        return isCheckingAccountType;
    }

    public void setIsCheckingAccountType(boolean isCheckingAccountType) {
        this.isCheckingAccountType = isCheckingAccountType;
    }
 
}
