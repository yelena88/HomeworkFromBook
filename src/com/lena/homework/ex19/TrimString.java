package com.lena.homework.ex19;

/* Задание 19
Имеется строка с текстом. Подсчитать количесто слов в тексте. Желательно учесть, что слова могут разделяться
несколькими пробелами, в начале и в конце текста также могут быть пробелы, но могут и отсутствовать. */

public class TrimString {
    public static void main(String[] args) {

        String testString = " I love coffee, I love tea, I love java programming ; and java   loves me.";
        trimString(testString);
    }

    private static void trimString(String text) {

        //Производим замену всех знаков на пустоту, кроме буквенных символов a-z A-Z а-я А-Я и одного пробела
        text = text.replaceAll("[^a-zA-Zа-яА-Я ]", "");

        //Удаляем пробелы в начале и конце строки, далее делим текст по пробелам
        text = text.trim();
        String[] splitText = text.split(" ");

        //Вводим новую переменную, в которой будет произведен подсчет слов в тексте
        int realCount = 0;
        for (String s : splitText) {
            if (s.length() > 0)
                realCount++;
        }

        System.out.println("Text contains " + realCount + " words.");
    }
}
