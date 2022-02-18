package ru.mirea.lab2;

public class Main {

    public static void main(String[] args) {
        System.out.println("1) Начальный список:");
	    App app=new App();
        app.printList();
        System.out.println("2) Список отсортированны по фамилии в обратном порядке:");
        app.sortByLastName();
        System.out.println("3.1) Список отфильтрованный по принципу вес больше возраста:");
        app.sortByWA();
        System.out.println("3.2) Список отфильтрованный по принципу возраст больше веса:");
        app.sortByAW();
        System.out.print("Сумма всех весов: ");
        app.sumWeight();
    }
}
