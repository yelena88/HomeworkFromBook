package com.lena.homework.ex18;

/* Задание 18
Найдите в строке не только запятые, но и другие знаки препинания.
Подсчитать их общее количество.*/

public class Signs {
    public static void main(String[] args) {

        String str = "Тестовая строка?! Она же с несколькими,, запятыми и точками... " +
                "А также другими знаками препинания, которые нужно посчитать!!!";

        int n = 0;
        int m = 0;
        int a = 0;
        int b = 0;
        int sum = 0;
        char symbol;

        for (int i = 0; i < str.length(); i++) {

            symbol = str.charAt(i);
            if (symbol == ',') n++;
            if (symbol == '?') m++;
            if (symbol == '!') a++;
            if (symbol == '.') b++;
            sum = n + m + a + b;
        }

        System.out.println("В текстовой строке есть - " + n + " запятых.");
        System.out.println("Кроме запятых есть: " + m + " вопросительный знак, " + a + " воскличательных знака и " + b + " точки.");
        System.out.println("Общее количество всех знаков препинания составило - " + sum + " штук.");
    }
}
