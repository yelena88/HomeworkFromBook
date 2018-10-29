package com.lena.homework.ex6;

/* Задание 6
Имеется три числа - день, месяц, год. Вывести в виде трех чисел дату следующего дня
Добавлен расчет между периодами в днях, месяцах и годах.
А также добалена проверка, является ли введенный год високосным.
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberOfNextDay {
    public static void main(String[] args) {

        // Задаем дату LocalDate через метод "of" и увеличиваем дату на один день, через plusDays
        LocalDate nextDay = LocalDate.of(2016, 2, 28).plusDays(1);
        System.out.println("Дата следующего дня (методом of) - " + nextDay);

        //Задаем дату LocalDate через метод "parse" и увеличиваем дату на один день, через plusDays

        LocalDate nextDay2 = LocalDate.parse("2018-02-28").plusDays(1);
        System.out.println("Дата следующего дня (методом parse)  - " + nextDay2);
        System.out.println();

        //Проверим был ли введенный год високосным

        boolean leapYear = LocalDate.of(2016, 2, 28).isLeapYear();
        System.out.println("Является ли введенный год високосным? - " + leapYear);

        //Проверим был ли введенный год високосным

        boolean leapYear2 = LocalDate.parse("2018-02-28").isLeapYear();
        System.out.println("Является ли введенный год високосным? - " + leapYear2);
        System.out.println();

        //Получим период в днях, месяцах и годах между двумя датами

        long period = ChronoUnit.DAYS.between(nextDay, nextDay2);
        System.out.println("Период в днях между датами составил: " + period + " день");

        long period2 = ChronoUnit.MONTHS.between(nextDay, nextDay2);
        System.out.println("Период в месяцах между датами составил: " + period2 + " месяц (-а)");

        long period3 = ChronoUnit.YEARS.between(nextDay,nextDay2);
        System.out.println("Период в годах между датами составил: " + period3 + " год (-а)");


    }
}
