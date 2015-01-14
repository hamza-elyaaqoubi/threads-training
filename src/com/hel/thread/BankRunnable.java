package com.hel.thread;

/**
 * Created by Hmiza on 12/01/2015.
 */
public class BankRunnable implements Runnable {

    private BankAccount bankAccount;
    private String name;

    public BankRunnable(BankAccount bankAccount, String name) {
        this.bankAccount = bankAccount;
        this.name = name;
    }

    public void run() {
        for(int i = 0 ; i < 5; i++) {
            if (bankAccount.getAccount() > 0) {
                bankAccount.withdrawal(5, this.name);
                System.out.println("withdrawal money performed by -> " + this.name);
            }
        }
    }
}
