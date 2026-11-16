package com.pluralsight.staticcling;

public class Person {

    String name;
    static String classification = "Homo sapien";
    static int peopleCounter;

    public static void staticMethod(){
        System.out.println("I am a static method");
    }

    public void instanceMethod(){
        System.out.println("I'm running on instance of Person object with name " + this.name);
    }

    public Person(String name){
        this.name = name;
        Person.peopleCounter += 1;
    }

    public Person(){}

    public static void setClassification(String classification){
        Person.classification = classification;
    }

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
