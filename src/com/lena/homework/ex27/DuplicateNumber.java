package com.lena.homework.ex27;

/*
Задание 27
Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public static void main(String[] args) {

        int[] random = new Random().ints(20, 1, 21).toArray();
        List<Integer> numbers = new ArrayList<>();

        for (int i : random) {
            numbers.add(i);
        }

        new DuplicateNumber().removeDuplicates(numbers);
    }

    void removeDuplicates(List<Integer> numbers) {

        System.out.print("Все цифры: ");

        for (Integer num : numbers) {
            System.out.print(num + ", ");
        }
        System.out.println();

        // используя stream
        numbers = numbers.stream().distinct().sorted().collect(Collectors.toList());

        System.out.print("Дубликаты удалены: ");

        for (Integer num : numbers) {
            System.out.print(num + ", ");
        }
    }
}

