package com.lena.homework.ex22;

/* Задание 22
Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами:
секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте, сравнение двух объектов
(метод должен работать аналогично compareTo в строках). Создать два конструктора: получающий общее количество секунд,
 минуты, часы и секунды по отдельности. Сделать метод для вывода данных. Прочее на усмотрение.
 */

public class Tester {
    public static void main(String[] args) {
        // Создание двух промежутков времени, используя разные конструкторы
        TimeFragment timeFragment1 = new TimeFragment(1, 1, 10);
        TimeFragment timeFragment2 = new TimeFragment(25000);

        // вызываем метод, получающий полное количество секунд в объекте
        // а так же метод для вывода данных (overriden toString()).
        System.out.println(timeFragment1.toString() + " в секундах = " + timeFragment1.toSeconds().getSeconds() + " секунд");

        // сравним 2 объекта промежутка времени
        System.out.println("=====================================");
        System.out.println("1й промежуток времени " + timeFragment1.toString());
        System.out.println("2й промежуток времени " + timeFragment2.toString());
        System.out.println("Результат сравнения этих объектов по принципу Comparable interface's compareTo method = "
                + timeFragment1.compareTo(timeFragment2));

        // Выдаем ошибку в случае негативного числа, раскомментировав строку ниже для проверки на эту ошибку
     //   TimeFragment timeFragment3 = new TimeFragment(-1, -1, 0);
    }
}
