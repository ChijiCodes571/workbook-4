package com.pluralsight.staticcling;

public class Person {
    static String classification = "Homo sapien";
    String name;
    static int peopleCounter;

    public Person(String name){
        this.name = name;
        Person.peopleCounter += 1;
    }

    public Person(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + name);
    }
}
