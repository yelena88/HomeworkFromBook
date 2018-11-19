package com.lena.homework.ex24;

import com.lena.homework.ex24.interfaces.GamingAppliance;

public class NintendoSwitch extends GeneralGamingConsole implements GamingAppliance {
    public NintendoSwitch(String perf, String mem, String name) {
        this.performance = perf;
        this.memory = mem;
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Ваша консоль " + name + " запускает игру!");
    }

    @Override
    public void turnOn() {
        this.state = true;
        System.out.println("Ваша консоль " + name + " была включена!");
    }

    @Override
    public void turnOff() {
        this.state = false;
        System.out.println("Ваша консоль " + name + " была выключена!");
    }

    @Override
    public String toString() {
        return "Это игровая консоль " + name + " на " + performance + " ЦПУ и имеет " + memory + " RAM.";
    }
}
