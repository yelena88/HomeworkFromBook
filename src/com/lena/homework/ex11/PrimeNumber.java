package com.lena.homework.ex11;

/* Задание 11
Решить задание на поиск простых чисел, т.е числа делится без остатка только на 1 и себя */

public class PrimeNumber {
    public static void main(String[] args) {

        int a, b;
        boolean isPrime;

        for (a = 2; a < 500; a++) {
            isPrime = true;

            // Проверяем, делится ли число без остатка
            for (b = 2; b < a; b++)
                // если число делится без остатка, значит, оно не простое
                if ((a % b) == 0) isPrime = false;

            if (isPrime)
                System.out.println(a + " - простое число.");
        }
    }
}