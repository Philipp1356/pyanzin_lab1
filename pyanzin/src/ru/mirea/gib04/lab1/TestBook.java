package ru.mirea.gib04.lab1;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Гарри Поттер", "Дж. К. Роулинг", 270, "фентези");
        Book b2 = new Book("Метро 2033", "Дмитрий Глуховский", 650, "постапокалипс");
        Book b3 = new Book("Мечтают ли андроиды об электроовцах", "Филип Дик", 260, "фантастика");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}