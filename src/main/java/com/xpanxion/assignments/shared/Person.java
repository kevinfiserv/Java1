package com.xpanxion.assignments.shared;

public class Person {
    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        String id = "id=" + this.id + ", ";
        String firstname = "firstName=" + this.firstName + ", ";
        String lastName = "lastName=" + this.lastName + "}";
        return "Person {" + id + firstname + lastName;
    }
}
