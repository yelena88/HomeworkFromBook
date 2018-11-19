package com.lena.homework.ex23;

import java.util.ArrayList;
import java.util.Arrays;

public class ATM {
    private int hunredNote;
    private int fiftyNote;
    private int twentyNote;
    private int balance;

    public ATM(int hunredNote, int fiftyNote, int twentyNote) {
        this.hunredNote = hunredNote;
        this.fiftyNote = fiftyNote;
        this.twentyNote = twentyNote;

        // получаем суммарный баланс
        balance += hunredNote * 100 + fiftyNote * 50 + twentyNote * 20;
    }

    public void deposit(int hunredNote, int fiftyNote, int twentyNote) {
        // Load the ATM
        this.hunredNote += hunredNote;
        this.fiftyNote += fiftyNote;
        this.twentyNote += twentyNote;
        balance += hunredNote * 100 + fiftyNote * 50 + twentyNote * 20;
    }

    public boolean withdraw(int requestedAmount) {
        System.out.format("Вы запросили сумму в размере %d рублей.\n", requestedAmount);
        System.out.println("Ваш баланс состовляет: " + this.balance);
        if (requestedAmount % 10 != 0) {
            System.out.println("Неверная сумма, укажите сумму не меньше 20 рублей и кратная 20 или 50!");
            return false;
        } else if (requestedAmount > this.balance) {
            System.out.format("Запрошенная сумма превышает ваш баланс %d рублей.\n", this.balance);
            return false;
        } else {
            ArrayList<Integer> listNominal = new ArrayList<>(Arrays.asList(20, 100, 50));
            int[] count = new int[listNominal.size()]; //кол-во купюр выдать
            int index = listNominal.size() - 1;

            if (requestedAmount % 100 == 10 || requestedAmount % 100 == 30) {
                requestedAmount -= listNominal.get(2);
                count[2] += 1;
            }
            if (requestedAmount % 20 == 0 && requestedAmount < 100) {
                listNominal = new ArrayList<>(Arrays.asList(20));
                index = listNominal.size() - 1;
            }
            if (requestedAmount > 100 && requestedAmount % 20 == 0) {
                listNominal = new ArrayList<>(Arrays.asList(20, 100));
                index = listNominal.size() - 1;
            }

            while (index != -1) {
                count[index] += requestedAmount / listNominal.get(index);
                requestedAmount %= listNominal.get(index);
                index--;
            }

            listNominal = new ArrayList<>(Arrays.asList(20, 50, 100));
            int temp = count[1];
            count[1] = count[2];
            count[2] = temp;
            for (int i = 0; i < listNominal.size(); i++) {
                System.out.printf("Номинал в %d руб. = %d шт.\n", listNominal.get(i), count[i]);
                balance -= listNominal.get(i) * count[i];
            }
        }
        System.out.println("Ваш баланс состовляет: " + this.balance);
        return true;
    }
}
