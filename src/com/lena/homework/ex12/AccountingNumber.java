package com.lena.homework.ex12;

/* Задание 12
Имеется целое число, следует вывести его в бухгалтерском формате. Т.е. начиная справа каждые три позиции
отделяются пробелом. Например число 20023143 должно быть выведено как 20 023 143 */

public class AccountingNumber {

    public static void main(String[] args) {

        Long testNum = 20023143L;
        System.out.println(toAccountantFormat(testNum));
    }

    private static String toAccountantFormat(Long testNum) {

        /*Используем StringBuilder с методом insert, чтобы полученный результат расположить  в нужном месте,
        т.к. метод append возвращает полученный результат в конец  и не может использоваться в данном случае*/

        String result = testNum.toString();
        StringBuilder finalist = new StringBuilder();

        for (int i = result.length(); i > 0; i -= 3) {
            if (i >= 3) {
                finalist.insert(0, result.substring(i - 3, i) + " ");
            } else {
                finalist.insert(0, result.substring(0, i) + " ");
            }
        }
        return finalist.toString().trim();
    }
}