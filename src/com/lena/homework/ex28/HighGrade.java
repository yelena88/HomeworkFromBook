package com.lena.homework.ex28;

/*
Задание 28
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Найти самую высокую оценку с испльзованием итератора.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class HighGrade {
    public static void main(String[] args) {

        int[] random = new Random().ints(10, 1, 11).toArray();
        List<Integer> grades = new ArrayList<>();

        for (int i : random) {
            grades.add(i);
        }

        new HighGrade().maxGrade(grades);
    }

    private void maxGrade(List<Integer> grades) {
        Iterator<Integer> iterator = grades.iterator();
        int maxGrade = 0;

        System.out.print("Все оценки: ");
        for (Integer num : grades) {
            System.out.print(num + ", ");
        }
        System.out.println();

        while (iterator.hasNext()) {
            int val = iterator.next();

            if (maxGrade < val) maxGrade = val;
        }
        System.out.print("Самая высокая оценка: " + maxGrade);
    }
}