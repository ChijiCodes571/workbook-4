package com.pluralsight.staticcling;

public class PersonsMain {
    public static void main(String[] args) {
        Persons alice = new Persons();
        alice.name = "Alice";
        alice.age = 20;

        Persons bob = new Persons();
        bob.name = "Bob";
        bob.age = 22;

        System.out.println(
                alice.name + ", " + alice.age + ", " + Persons.classroom
        );
        System.out.println(
                bob.name + ", " + bob.age + ", " + Persons.classroom
        );

        alice.age++;
        System.out.println("--------------");

        System.out.println(
                alice.name + "," + alice.age + "," + Persons.classroom
        );

        System.out.println(
                bob.name + "," + bob.age + "," + Persons.classroom
        );

        Persons.classroom = "Room 202";
        // The age is going to have the updated version of the age.
        System.out.println(
                alice.name + "," + alice.age + "," + Persons.classroom
        );

        System.out.println(
                bob.name + "," + bob.age + "," + Persons.classroom
        );

        Persons chuck = new Persons();
        chuck.name = "Chuck";
        chuck.age = 60;

        System.out.println(
                // the classroom will be 202 because we reassinged the classroom
                chuck.name + "," + chuck.age + "," + Persons.classroom
        );
    }
}
