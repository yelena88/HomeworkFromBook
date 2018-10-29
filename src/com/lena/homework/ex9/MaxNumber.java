package com.lena.homework.ex9;

/* Задане 9
Имеется последовательность случайных чисел, найти и вывести наибольшее из них */

public class MaxNumber {
    public static void main(String[] args) {

        int x = 0; // начальная точка диапазона рандома - x
        int b = 20; // конечная точка диапазона рандома - b

        int r1 = x + (int) (Math.random() * b);
        System.out.println("Рандомное число r1 - " + r1);
        int r2 = x + (int) (Math.random() * b);
        System.out.println("Рандомное число r2 - " + r2);
        int r3 = x + (int) (Math.random() * b);
        System.out.println("Рандомное число r3 - " + r3);

        if (r1 > r2) {
            if (r1 > r3) {
                System.out.println("Максимальное рандомное число -" + r1);
            } else {
                System.out.println("Максимальное рандомное число - " + r3);
            }
        } else {
            if (r2 > r3) {
                System.out.println("Максимальное рандомное число - " + r2);
            } else {
                System.out.println("Максимальное рандомное число - " + r3);
            }
        }
    }
}

