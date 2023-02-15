package com.example.accountmicroservice;

public class AccountDetails {

   private String userEmail;

   private boolean bankAccountActive;

   private String bankName;

    private Integer accountNumber;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public boolean isBankAccountActive() {
        return bankAccountActive;
    }

    public void setBankAccountActive(boolean bankAccountActive) {
        this.bankAccountActive = bankAccountActive;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }






}
