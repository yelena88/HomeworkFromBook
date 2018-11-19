package com.lena.homework.ex25;

import com.lena.homework.ex25.interfaces.InstallmentCreditCard;

public class Xalva implements InstallmentCreditCard {
    @Override
    public void periodOfPayments() {
        // выдать рассрочку на Х месяцев
    }

    @Override
    public void pay() {
        // оплатить кредит (рассрочку)
    }
}
