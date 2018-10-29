package com.lena.homework.ex15;

/* Задание 15
Определите сумму элементов массива, расположенных между минимальными и максимальными значениями */

import java.util.Random;

public class SumArray {
    public static void main(String[] args) {

        MinMaxSum(150, 835, new int[20]);
    }

    private static void MinMaxSum(int min, int max, int[] num) {

        //Создаем рандомом элемента массива размером из 20-ти чисел
        int sum = 0;
        Random random = new Random();

        System.out.println("Неотсортированный массив: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(1000);
            System.out.print(num[i] + ", ");
        }
        //Сортируем элементы массива согласно условию, и определяем сумму из полученных элементов
        System.out.println("\nОтсортированный массив: ");

        for (int aNum : num) {
            if (aNum > min && aNum < max) {
                sum += aNum;
                System.out.print(aNum + ", ");
            }
        }
        System.out.println("\n\nСумма элементов массива, расположенных между min и max значениями составила: " + sum);
    }
}
