package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
//        Балык, Попугай, мышык жана ит деген класс тузунуз
//        Алардын свойстваларын ойлоп табыныз
//        Бир канча объектилерин тузуп жана аларга маанилерин бериниз
//        Аларды консольго чыгарыныз
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
        Fish fish = new Fish();
        fish.setName("Semga");
        fish.setAge(2);
        fish.setColor("Grey");
        System.out.println(fish.getName()+" "+fish.getAge()+" "+fish.getColor());
        fish.suuJanybary();
        System.out.println("---------------------------------------------------");
        Parrot parrot = new Parrot();
        parrot.setName("Ivan");
        parrot.setAge(4);
        parrot.setColor("Blue");
        System.out.println(parrot.getName()+" "+parrot.getAge()+" "+parrot.getColor());
        parrot.suiloo();
        System.out.println("------------------------------------------------------");
        Cat cat = new Cat();
        cat.setName("Bagira");
        cat.setAge(1);
        cat.setColor("White");
        System.out.println(cat.getName()+" "+cat.getAge()+" "+cat.getColor());
        cat.karmoo();
        System.out.println("--------------------------------------------------------");
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(5);
        dog.setColor("Black");
        System.out.println(dog.getName()+" "+ dog.getAge()+" "+ dog.getColor());
        dog.urot();


            }
        }








