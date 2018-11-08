package com.lena.homework.ex10;

/* Задание 10
Имеется целое число. Следует посчитать сумму цифр данного числа */

public class SumNumber {
    public static void main(String[] args) {
        // наша цифра
        int x = 10;
        SumOfNum(x);
    }

    private static void SumOfNum(int x) {
        int sum = 0;
        for (int a = 1; a <= x; a++) {
            sum += a;
        }
        System.out.println("Сумма всех цифр числа x, равняется " + sum + ".");
    }
}
