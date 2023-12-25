package org.example;
import java.util.Scanner;

public class MobileBank {
    private String userMobileName;
    private int accountNumber; //номер счёта
    private int amountOfFunds; //количество денежных средств
    private int phoneNumber;
    private int password;

    public String getUserMobileName() {
        return userMobileName;
    }
    public void setUserMobileName(String userMobileName) {
        this.userMobileName = userMobileName;
    }


    public int getAccountNumber() {
        return accountNumber;
    }
    public int getAmountOfFunds() {
        return amountOfFunds;
    }
    public void setAmountOfFunds(int amountOfFunds) {
        this.amountOfFunds = amountOfFunds;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public MobileBank(String userMobileName, int accountNumber, int amountOfFunds, int phoneNumber, int password){
        this.userMobileName = userMobileName;
        this.accountNumber = accountNumber;
        this.amountOfFunds = amountOfFunds;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }



}
