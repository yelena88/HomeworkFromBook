package com.lena.homework.ex10;

/* Задание 10
Имеется целое число. Следует посчитать сумму цифр данного числа */

public class SumNumber {
    public static void main(String[] args) {

        int sum = 0;
        for (int a=0; a<=10; a++){
            sum += a;
        }
        System.out.println("Сумма всех чисел числа а, равняется - " + sum + ".");
    }
}
