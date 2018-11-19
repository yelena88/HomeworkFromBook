package com.lena.homework.ex29;

/*
Задание 29
Имеется текст. Следует составить для него частотный словарь
 */

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        countWords();
    }

    private static void countWords() {
        String sentence;
        List<String> sentences = new ArrayList<>();

        while (true) {
            System.out.println("Введите  прердложение,   exit -  для выхода");
            Scanner scanner = new Scanner(System.in);

            sentence = scanner.nextLine().toLowerCase();
            
            if (sentence.equals("exit")) break;
            sentences.add(sentence);
        }

        Hashtable<String, Integer> vocabulary = new Hashtable<>();
        for (String s : sentences) {
            String splitter = "[ ,.]";

            for (String word : s.split(splitter)) {
                int count = 0;

                if (vocabulary.containsKey(word)) {
                    count = vocabulary.get(word);
                    vocabulary.put(word, count + 1);

                } else {
                    vocabulary.put(word, count + 1);
                }
            }
        }

        Set<String> keys = vocabulary.keySet();

        for (String key : keys) {
            System.out.format("слово = \"%s\"; кол-во = %s \n", key, vocabulary.get(key));
        }
    }
}
