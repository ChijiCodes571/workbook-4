package com.pluralsight.staticcling;

public class Main {

    public static void main(String[] args) {

        System.out.println(Person.classification);
        Person.staticMethod();

        Person p1 = new Person();
        Person p2 = new Person();

        Person.classification = "Homo Sapien";

        p1.setName("Hande");
        p2.setName("Destiny");

        p1.instanceMethod(); // an instance method runs on an instance of the class.

        System.out.println("Person 1: ");
        p1.display();

        System.out.println("Person 2: ");
        p2.display();


    }
}
