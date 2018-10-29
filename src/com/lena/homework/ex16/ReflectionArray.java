package com.lena.homework.ex16;

/* Задание 16
Создать массив, заполнить случайными числами, распечатать, перевернуть, и снова распечатать
(при переворачивании не желательно создавать еще один массив) */

import java.util.Arrays;
import java.util.Random;

public class ReflectionArray {
    public static void main(String[] args) {
        ArrayInReflection(new int[10]);
    }

    private static void ArrayInReflection(int[] array) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(250);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
