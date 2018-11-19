package com.lena.homework.ex24;

import com.lena.homework.ex24.interfaces.KitchenAppliance;

public class MicrowaveOven extends GeneralKitchenDevice implements KitchenAppliance {
    public MicrowaveOven(String power,String name) {
        this.performance = power;
        this.name = name;
    }

    @Override
    public void cook() {
        System.out.println("Вашa микроволновка "+name+ " готовит еду... ;-)");
    }

    @Override
    public void turnOn() {
        this.state = true;
        System.out.println("Ваша микроволновка была включена!");
    }

    @Override
    public void turnOff() {
        this.state = false;
        System.out.println("Ваша микроволновка была выключена!");
    }

    @Override
    public String toString() {
        return "Это микроволновка " + name + " мощностью " + performance + " ватт.";
    }
}
