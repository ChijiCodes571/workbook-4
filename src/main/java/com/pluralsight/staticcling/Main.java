package com.pluralsight.staticcling;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Hande");
        Person p2 = new Person("Destiny");

        Person.classification = "Homo Sapien Sapien ";

        p1.setName("Hande");
        p2.setName("Destiny");

        System.out.println("Person 1: ");
        p1.display();

        System.out.println("Person 2: ");
        p2.display();


    }
}
