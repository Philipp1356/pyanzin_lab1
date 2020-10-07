package ru.mirea.gib04.lab1;

import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bobik", 5);
        Dog d2 = new Dog("Sharik", 9);
        Dog d3 = new Dog("Druzhok");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}