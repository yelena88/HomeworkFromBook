package com.lena.homework.ex26;

/*
Задание 26
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeFilter {
    public static void main(String[] args) {

        int[] random = new Random().ints(10, 1, 10).toArray();
        List<Integer> grades = new ArrayList<>();

        for (int i : random) {
            grades.add(i);
        }

        new GradeFilter().filterStudentList(grades);
    }

    void filterStudentList(List<Integer> grades) {

        System.out.print("Все оценки: ");

        for (Integer grade : grades) {
            System.out.print(grade + ", ");
        }

        System.out.println();

        // Неудовлетворительная оценка по 10-бальной системе, считается оценка ниже 3-ки
        grades.removeIf(x -> x < 3);

        System.out.print("Неудовлетворительные оценки удалены: ");
        for (Integer grade : grades) {
            System.out.print(grade + ", ");
        }
    }
}

