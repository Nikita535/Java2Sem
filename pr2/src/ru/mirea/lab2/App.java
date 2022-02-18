package ru.mirea.lab2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    List<Human> list=new ArrayList();

    public App() {
        LocalDate date=LocalDate.now();
        list = Stream.of(new Human(60,"Nikita","Zhiznevskiy",date,70),
                new Human(80,"Pasha","Voytenko",date,75),
                        new Human(90,"Alex","Dobrobaba",date,69),
                                new Human(13,"Bob","Karas",date,80)).collect(Collectors.toList());
    }

    public void printList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void sortByLastName()
    {

        List sortedList = list.stream()
                .sorted(Comparator.comparing(Human::getLastName).reversed())
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);

    }

    public void sortByWA(){
        List sortedList = list.stream().filter(t->t.getWeight()>t.getAge()).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public void sortByAW(){
        List sortedList = list.stream().filter(t->t.getWeight()<t.getAge()).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    public void sumWeight(){
        int sum=list.stream().mapToInt(Human::getWeight).sum();
        System.out.println(sum);
    }




}
