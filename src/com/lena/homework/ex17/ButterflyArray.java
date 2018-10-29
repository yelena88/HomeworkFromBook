package com.lena.homework.ex17;

/* Задание 17
Создать двухмерный квадратный массив, и заполнить его <<бабочкой>> */

public class ButterflyArray {

    public static void main(String[] args) {

        int m[][] = new int[5][5];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (i == 0 || i == 4) {
                    System.out.print("1 ");

                } else if ((i == 1 || i == 3) && (j == 1 || j == 2 || j == 3)) {
                    System.out.print("1 ");

                } else if (i == 2 && j == 2) {
                    System.out.print("1 ");

                } else {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
