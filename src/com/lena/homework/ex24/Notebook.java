package com.lena.homework.ex24;

import com.lena.homework.ex24.interfaces.ComputerAppliance;

public class Notebook extends GeneralComputer implements ComputerAppliance {
    public Notebook(String perf, String mem, String name) {
        this.performance = perf;
        this.memory = mem;
        this.name = name;
    }

    @Override
    public void compute() {
        System.out.println("Ваш ноутбук выполняет важные вычисления... ;-)");
    }

    @Override
    public void display() {
        System.out.println("Ваш ноутбук выполняет обработку графики!");
    }

    @Override
    public void turnOn() {
        this.state = true;
        System.out.println("Ваш ноутбук был включен!");
    }

    @Override
    public void turnOff() {
        this.state = false;
        System.out.println("Ваш ноутбук был выключен!");
    }

    @Override
    public String toString() {
        return "Это ноутбук " + name + " на " + performance + " ЦПУ и имеет " + memory + " RAM.";
    }
}
