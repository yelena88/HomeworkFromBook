package com.lena.homework.ex21;

/*Задание 21
    Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
    а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
*/

public class ConcatLines {

    public static void main(String[] args) {

        //Определяем текущее время, затем вызываем метот stringConcat
        long now = System.currentTimeMillis();
        stringConcat();
        System.out.println("Cложение строк с помощью оператора сложения и String " + (System.currentTimeMillis() - now) + " ms");

        //Переопределяем текущее время и вызываем метод stringBuilderAppend
        now = System.currentTimeMillis();
        stringBuilderAppend();
        System.out.println("Cложение строк с помощью StringBuilder " + (System.currentTimeMillis() - now) + " ms");
    }

    private static void stringBuilderAppend() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10000; i++)
            s.append("a+b=c; ");
    }

    private static void stringConcat() {
        String s = "";
        for (int i = 0; i < 10000; i++)
            s += "a+b=c; ";
    }
}

