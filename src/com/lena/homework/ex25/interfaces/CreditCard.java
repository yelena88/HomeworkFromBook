package com.lena.homework.ex25.interfaces;

public interface CreditCard extends BankCard, International {
    void issueCredit(double amount);
}
