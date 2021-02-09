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
public class Saving {
   // bank saving
 private String savingBankName;
 private String savingBankRoutingNumber;
 private String savingBankAccountNumber;
 private String savingAccountBalance;
 private boolean isSavingAccountType;

    public String getSavingBankName() {
        return savingBankName;
    }

    public void setSavingBankName(String savingBankName) {
        this.savingBankName = savingBankName;
    }

    public String getSavingBankRoutingNumber() {
        return savingBankRoutingNumber;
    }

    public void setSavingBankRoutingNumber(String savingBankRoutingNumber) {
        this.savingBankRoutingNumber = savingBankRoutingNumber;
    }

    public String getSavingBankAccountNumber() {
        return savingBankAccountNumber;
    }

    public void setSavingBankAccountNumber(String savingBankAccountNumber) {
        this.savingBankAccountNumber = savingBankAccountNumber;
    }

    public String getSavingAccountBalance() {
        return savingAccountBalance;
    }

    public void setSavingAccountBalance(String savingAccountBalance) {
        this.savingAccountBalance = savingAccountBalance;
    }

    public boolean isIsSavingAccountType() {
        return isSavingAccountType;
    }

    public void setIsSavingAccountType(boolean isSavingAccountType) {
        this.isSavingAccountType = isSavingAccountType;
    }

 
}
