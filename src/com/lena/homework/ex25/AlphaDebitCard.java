package com.lena.homework.ex25;

/*
Задание 25
Создать иерархию классов, описывающих банковские карточки.
иерархия должная иметь хотя бы три уровня.
 */

import com.lena.homework.ex25.interfaces.DebitCard;

public class AlphaDebitCard implements DebitCard {
    @Override
    public void issueDebit() {
        // зачислить баланс на счет
    }

    @Override
    public void pay() {
        // заплатить за что либо
    }
}
