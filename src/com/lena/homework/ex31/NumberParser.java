package com.lena.homework.ex31;

/*
Задание 31
Имеется файл с текстом в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму,
убрать все повторяющиеся числа и снова распечатать
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class NumberParser {
    public static void main(String[] args) {

        try {
            readAndProcFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAndProcFile() throws IOException {

        String input = "";
        List<Integer> numbers = new ArrayList<>();
        File file = new File("src/com/lena/homework/ex31/numbers.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));

        try {
            while (bufferedReader.ready()) input = (bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileInputStream.close();
        }

        List<String> arrayList = new ArrayList<>(Arrays.asList(input.split(" ")));

        for (String s : arrayList) {
            numbers.add(Integer.parseInt(s.trim()));
        }

        System.out.print("Цифры в файле: ");

        numbers.forEach(x -> System.out.print(x + " "));

        System.out.print("\nСумма цифр в файле: ");
        System.out.print(numbers.stream().mapToInt(x -> x.intValue()).sum());

        System.out.println();
        System.out.print("Цифры в файле без дубликатов: ");

        numbers.stream().distinct().forEach(x -> System.out.print(x + " "));

        System.out.print("\nСумма цифр в файле без дубликатов: ");
        System.out.print(numbers.stream().distinct().mapToInt(x -> x.intValue()).sum());
    }
}
