package com.lena.homework.ex8;

/* Задание 8
Рассчитать факториал введенного числа*/

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) throws InputMismatchException {

        /*Добавляем код, который будет вызван при ошибке (если введено дробное число или буква)
         и далее будет предложено ввести новое число*/

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите целое число консоли (через пробел), затем нажмите Enter:");

            int d = scan.nextInt();
            System.out.println("Факториал введенного числа равен: " + factorial(d));

        } catch (Exception e) {
            System.out.println("Вы ввели не число либо не целое число, попробуйте ещё раз!");

            main(args);
        }
    }
    /* Так как факториал числа может выйти за размеры не только int, но и long,
    то используем BigInteger */

    private static BigInteger factorial(int d) {
        BigInteger res = BigInteger.valueOf(1);
        for (int n = 2; n <= d; n++) {
            res = res.multiply(BigInteger.valueOf(n));

        }
        return res;
    }

}
