package ru.mirea.gib04.lab1;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(24.5, "white", "football", 2500);
        Ball b2 = new Ball(23.5, "orange", "basketball", 3000);
        Ball b3 = new Ball(26.5, "yellow", "volleyball", 4500);
        b3.setColor("red");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}