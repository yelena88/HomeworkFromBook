package com.lena.homework.ex10;

/* Задание 10
Имеется целое число. Следует посчитать сумму цифр данного числа */

public class SumNumber {
    public static void main(String[] args) {
        // наша цифра
        int x = 7554;
        SumOfNum(x);
    }

    private static void SumOfNum(int x) {
        int y = 0;

        while (x > 0) {
            y += x % 10;
            x /= 10;
        }

        System.out.print("Сумма цифр числа x, равняется " + y + ".");
    }
}
