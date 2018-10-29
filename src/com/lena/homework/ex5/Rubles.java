package com.lena.homework.ex5;

/* Задание 5
Имеется целое цисло (любое), это число - сумма денег в рублях.
Ввести это  число, добавив к нему слово <<рублей>> в правильном падеже.
 */

public class Rubles {
    public static void main(String[] args) {

        Rubles.CorrectCasesOfRubles(21);
        Rubles.CorrectCasesOfRubles(63);
        Rubles.CorrectCasesOfRubles(522);
        Rubles.CorrectCasesOfRubles(45);
        Rubles.CorrectCasesOfRubles(12);
        Rubles.CorrectCasesOfRubles(1800);
        Rubles.CorrectCasesOfRubles(111);
        Rubles.CorrectCasesOfRubles(713);
        Rubles.CorrectCasesOfRubles(98);
        Rubles.CorrectCasesOfRubles(432);
    }

    private static void CorrectCasesOfRubles(int a) {
        if (a % 10 == 0 || a % 10 >= 5 || a % 100 == 11 || a % 100 == 12 || a % 100 == 13 || a % 100 == 14) {
            System.out.println(a + " рублей");
        } else if (a % 10 == 1) {
            System.out.println(a + " рубль");
        } else if (a % 10 == 2 || a % 10 == 3 || a % 10 == 4 || a % 100 != 12 && a >= 100 || a % 100 != 13 && a >= 100 || a % 100 != 14 && a >= 100) {
            System.out.println(a + " рубля");
        }
    }

}

