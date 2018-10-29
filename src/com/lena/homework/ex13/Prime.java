package com.lena.homework.ex13;

/*Задание 13
Имеется целое число, определить является ли это число простым,используя break */

public class Prime {

    public static void main(String args[]) {
        NumberIsPrime(169);
        NumberIsPrime(17);
        NumberIsPrime(961);
        NumberIsPrime(35);
        NumberIsPrime(199);
        NumberIsPrime(225);
        NumberIsPrime(1086);

    }

    private static void NumberIsPrime(int z) {

        for (int k = 1; k <= z; k++) {
            if (z % k != 0 && k > 1) {

                for (int i = k + 1; i < z; i++) {
                    if (z % i == 0) {

                        System.out.println(z + " - является  составным числом.");
                        return;
                    }
                }
                System.out.println(z + " - является простым числом");
                break;

            } else if (z % k == 0 && k > 1) {
                System.out.println(z + " - является  составным числом.");
                break;
            }
        }
    }
}

