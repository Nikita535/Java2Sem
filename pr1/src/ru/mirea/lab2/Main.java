package ru.mirea.lab2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        Predicate<String> containsA = t -> t.matches("^([0-9]{4})$|^([0-9]{6})$");

        System.out.println(containsA.test("1234"));
    }
}
