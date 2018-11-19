package com.lena.homework.ex24;

/*
Задание 24
Создать иерархию классов, описывающую бытовую технику. Создать несколько объектов описанных классов, часть из них
включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */

public class Main {
    public static void main(String[] args) {
        // Создаем бытовую технику
        Notebook notebook = new Notebook("3.0 GHz", "8 GB", "Toshiba Satellite C55-2343");
        NintendoSwitch nintendoSwitch = new NintendoSwitch("1.8 GHz", "32 GB", "Nintendo Switch");
        MicrowaveOven microwaveOven = new MicrowaveOven("800", "Samsung X394");

        // Ноутбук
        System.out.println(notebook);
        notebook.turnOn();
        notebook.compute();
        notebook.display();
        notebook.turnOff();

        System.out.println("==============================================================");

        // Приставка
        System.out.println(nintendoSwitch);
        nintendoSwitch.turnOn();
        nintendoSwitch.play();
        nintendoSwitch.turnOff();

        System.out.println("==============================================================");

        // Микроволновка
        System.out.println(microwaveOven);
        microwaveOven.turnOn();
        microwaveOven.cook();
        microwaveOven.turnOff();
    }
}
