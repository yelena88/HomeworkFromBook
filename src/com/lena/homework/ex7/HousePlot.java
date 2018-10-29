package com.lena.homework.ex7;

/* Задание 7
Имеется два дома размерами a на b и c на d. Имеется участок размерами e на f.
Проверить помещаются ли эти дома на данном участке.
Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.

 */

import com.lena.homework.ex8.FactorialNumber;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class HousePlot {

    public static void main(String[] args) throws InputMismatchException {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите в консоли (через пробел) 6 чисел, затем нажмите Enter:");

            /*Так как по условию у нас даны участки, а они могут имееть дробное число,
            то используем сканер со String для того, чтобы избежать ошибок при вводе дробных чисел.*/

            String a = scan.next();
            String b = scan.next();
            String c = scan.next();
            String d = scan.next();
            String e = scan.next();
            String f = scan.next();

            // Заменяем запятую в дробном числе на точку, чтобы программа не выдавала ошибку

            NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);

            double ad = format.parse(a).doubleValue();
            double bd = format.parse(b).doubleValue();
            double cd = format.parse(c).doubleValue();
            double dd = format.parse(d).doubleValue();
            double ed = format.parse(e).doubleValue();
            double fd = format.parse(f).doubleValue();

            HousePlotNum (ad, bd, cd, dd, ed, fd);

        } catch (Exception e) {
            System.out.println("Вы ввели не число, попробуйте ещё раз!");
            main(args);
        }
    }

    private static void HousePlotNum(double a, double b, double c, double d, double e, double f) {


        /* По условию задачи стороны домов - параллельны сторонам учсатка, в остальном размещение может быть любым.
        Поэтому, возможны только 8 вариантов размещения домов на участке e-f */

        if ((e >= a && e >= c && f >= (b + d))) {
            System.out.println("1 вариант: Можно разместить 2 дома на участке e-f");
        } else if (e >= b && e >= c && f >= (a + d)) {
            System.out.println("2 вариант: Можно разместить 2 дома на участке e-f");
        } else if (e >= a && e >= d && f >= (b + c)) {
            System.out.println("3 вариант: Можно разместить 2 дома на участке e-f");
        } else if (e >= b && e >= d && f >= (a + c)) {
            System.out.println("4 вариант: Можно разместить 2 дома на участке e-f");
        } else if (f >= a && f >= c && e >= (b + d)) {
            System.out.println("5 вариант: Можно разместить 2 дома на участке e-f");
        } else if (f >= b && f >= c && e >= (a + d)) {
            System.out.println("6 вариант: Можно разместить 2 дома на участке e-f");
        } else if (f >= a && f >= d && e >= (b + c)) {
            System.out.println("7 вариант: Можно разместить 2 дома на участке e-f");
        } else if (f >= b && f >= d && e >= (a + c)) {
            System.out.println("8 вариант: Можно разместить 2 дома на участке e-f");
        } else {
            System.out.println("На участке e-f НЕЛЬЗЯ разместить 2 дома");
        }
    }
}