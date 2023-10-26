package com.xpanxion.assignments.shared;

import com.xpanxion.assignments.stu0.Person;

import java.util.HashMap;
import java.util.Scanner;

public class PersonRepository {

    //
    // Data members
    //

    private final HashMap<Integer, Person> personHashMap;

    //
    // Constructors
    //

    public PersonRepository() {
        personHashMap = new HashMap<Integer, Person>();

        Scanner console = new Scanner(System.in);
        String name = "";
        int i = 1;

        while (true) {
            System.out.print("Enter Person: " + i + ", ");
            name = console.nextLine();
            if (name.equals("done")) {
                break;
            }
            String[] splitter = name.split(" ");

            personHashMap.put(i, new Person(i, splitter[0], splitter[1]));
            i++;
        }
        personHashMap.forEach((key, value) -> System.out.println(value.toString()));
    }

    //
    // Methods
    //

    public Person getPerson(Integer personId) {
        return personHashMap.get(personId);
    }
}
