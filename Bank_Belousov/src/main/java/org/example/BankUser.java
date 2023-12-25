package org.example;

public class BankUser implements User {
    private String userName;
    private int accountld;
    private double accountBalance;

    public BankUser(String userName,int accountld,double accountBalance){
        this.userName = userName;
        this.accountld = accountld;
        this.accountBalance = accountBalance;
    }

    @Override
    public String getUserName() {
        return "Белоусов Олег";
    }

    @Override
    public int getAccountid() {
        return 777;
    }

    @Override
    public double getAccountBalance() {
        return 190000;
    }
}
