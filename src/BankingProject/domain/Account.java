package BankingProject.domain;

public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double deposit) {
        this.balance = this.balance + deposit;
        return true;
    }

    public boolean withdraw(double withdraw) {
        if (withdraw > balance) {
            return false;
        } else {
            this.balance = this.balance - withdraw;
            return true;
        }

    }
}