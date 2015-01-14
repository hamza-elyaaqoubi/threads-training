package com.hel.thread;

public class BankAccount {
    private int account = 100;
    
    public int getAccount() {
        if (this.account < 0) {
            System.out.println("you are in a uncovered bank");
        }
        return this.account;
    }
    
    public synchronized void withdrawal(int amount, String threadName) {
        account = account - amount;
        System.out.println("new account -> " + this.account + " -- " + threadName);
    }

}
