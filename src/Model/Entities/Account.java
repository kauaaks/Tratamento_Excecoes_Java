package Model.Entities;

import Model.Exceptions.DomainException;

public class Account {

    private int number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(int number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void Deposit(Double amount) {
        balance += amount;
    }

    public void Withdraw(Double amount) throws DomainException {
        if(amount > balance){
            throw new DomainException("amount exceeds balance");
        }
        if(amount >= withdrawLimit){
            throw new DomainException("amount exceeds withdrawLimit");
        }
        balance-= amount;
    }

    @Override
    public String toString() {
        return "new balance: " + balance;
    }
}
