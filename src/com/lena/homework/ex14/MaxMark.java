package com.lena.homework.ex14;

/* Задание 14
Необходимо указать номер элемента наивысшей оценки, полученной учениками (не саму оценку) */

public class MaxMark {

    public static void main(String[] args) {

        int marks[] = new int[20];
        System.out.println("Отметки 20-ти учеников: ");

        for (int i = 0; i < 20; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i] + ",");
        }
        System.out.println();

        int maxMark = marks[0];
        int maxPos=0;

        for (int i = 0; i < marks.length; i++) {
            if (maxMark <= marks[i]) {
                maxMark = marks[i];
                maxPos = i;
            }
        }

        System.out.println("Номер максимальной оценки: " + maxPos);
    }
}
