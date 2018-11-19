package com.lena.homework.ex30;

/*
Задание 30
Создать файл с текстом, прочитать, посчитать в тексте количество знаков препинания и слов
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class FileParser {
    public static void main(String[] args)  {

        try {
            readAndProcFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAndProcFile() throws IOException {

        String sentence = "";
        List<String> sentences = new ArrayList<>();
        File file = new File("src/com/lena/homework/ex30/text.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {
            if (bufferedReader.ready()) sentence = bufferedReader.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sentences.add(sentence);

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
