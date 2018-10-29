package com.lena.homework.ex20;

/* Задание 20
Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов
*/

public class LastSymbolInWord {
    public static void main(String[] args) {

        String phrase = " Autumn, the year's last4, loveliest smile !?";

        //Производим замену всех знаков на пустоту, кроме буквенных символов a-z A-Z а-я А-Я и одного пробела
        phrase = phrase.replaceAll("[^a-zA-Zа-яА-Я ]", "");

        //Разделяем слова по пробелу
        String[] words = phrase.split(" ");
        StringBuilder newPhrase = new StringBuilder();

        //Определяем последнюю букву какждого слова и записываем в конец новой фразы из последних букв слов
        for (String word : words) {
            if (word.length() > 0)
                newPhrase.append(word.charAt(word.length() - 1));
        }

        System.out.println(newPhrase);
    }
}
