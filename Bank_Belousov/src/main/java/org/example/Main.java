package org.example;

public class Main {
    public static void main(String[] args) {
        Card card = new BankCard(466098,9090,544);
        ATM atm = new BankATM();
        atm.insertCard(card);
        atm.enterPinCode(9090);
        atm.requestBalance();
        atm.deposit(9000);
        atm.withdraw(30000);
    }
}