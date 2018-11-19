package com.lena.homework.ex32;

/*
Заданние 32
Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinaryNumbers {
    public static void main(String[] args) {

        try {
            writeAndProcFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeAndProcFile() throws IOException {
        String path = "src/com/lena/homework/ex32/numbers.txt";

        // создаем файл с 20 рандомными числами
        Random random = new Random();
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));

        for (int i = 1; i <= 20; i++) {
            dataOutputStream.writeInt(random.nextInt(20));
        }
        dataOutputStream.close();

        // прочитаем файл
        List<Integer> numbers = new ArrayList<>();
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));

        while (true) {

            try {
                numbers.add(dataInputStream.readInt());
            } catch (EOFException e) {
                break;
            }
        }
        dataInputStream.close();


        System.out.print("Цифры в файле: ");

        numbers.forEach(x -> System.out.print(x + " "));

        System.out.print("\nСреднее арифметическое значение цифр в файле: ");
        System.out.print(numbers.stream().mapToInt(x -> x.intValue()).summaryStatistics().getAverage());
    }
}
