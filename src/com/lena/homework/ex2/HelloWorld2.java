package com.lena.homework.ex2;

/* Задание 2
Имеется промежуток времени в секундах. Следует вывести его на страницу в виде часов, минут, секунд.
Продолжить приведенный пример, добавив расчет и вывод суток и недель
 */

public class HelloWorld2 {
    public static void main(String[] args) {

        final int s = 694861;
        int sec;
        int m;
        int min;
        int h, hour;
        int d, day;
        int week;

        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        week = (d - day) / 7;
        System.out.println(week + " недель, " + day + " сутки (-ок), " + hour + " час (-а,-ов), " + min + " минут (-а,-ы), " + sec + " секунд (-а,-ы)");

    }
}
