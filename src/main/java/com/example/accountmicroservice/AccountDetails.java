package com.example.accountmicroservice;

public class AccountDetails {

   private User user;

   private boolean bankAccountActive;

   private String bankName;

    private Integer accountNumber;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
