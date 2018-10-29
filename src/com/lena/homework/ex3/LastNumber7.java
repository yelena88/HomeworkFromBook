package com.lena.homework.ex3;

/* Задание 3
Создайте число. Определите, является ли последняя цифра числа семеркой
 */

public class LastNumber7 {

    public static void main(String[] args) {

        IsSeven(787);
        IsSeven(-787);
        IsSeven(154);

        String z = "42.7";
        System.out.println(LastSevenInString(z) ? z + " заканчивается семеркой" : z + " не заканчивается семеркой");

    }

    private static void IsSeven(int num) {

        /*Проверяем является ли число 7 последним числом в целочисленных положительных и отричательных числах.
        Произведем деление по модулю на 10, и, если после деления в остатке остается 7, то последнее число 7,
        иначе последнее число не 7.
         */

        if (num % 10 == 7 || num % 10 == -7) {
            System.out.println("Последняя цифра числа " + num + ", является семеркой");
        } else {
            System.out.println("Последняя цифра числа " + num + ", не является семеркой\n");
        }
    }

    private static boolean LastSevenInString(String z) {

        // Проверяем является ли число 7 последним числом в целых или дробных числах

        return String.valueOf(z).endsWith("7");
    }
}
