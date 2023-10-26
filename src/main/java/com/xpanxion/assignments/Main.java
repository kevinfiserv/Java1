package com.xpanxion.assignments;

import java.util.Scanner;

import com.xpanxion.assignments.shared.PersonRepository;
import com.xpanxion.assignments.student.JavaOne;

public class Main {
    public static void main(String[] args) throws Exception {
        JavaOne javaOne = new JavaOne();
        // javaOne.ex1();
        // javaOne.ex2();
        // javaOne.ex3();
        // javaOne.ex4();
        // javaOne.ex5();
        // javaOne.ex6();
        // javaOne.ex7();
        // javaOne.ex8();
        // javaOne.ex9();
        // javaOne.ex10();
        PersonRepository personDatabase = new PersonRepository();

        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Person ID: ");
            String id = console.nextLine();

            if (id.equals("done")) {
                break;
            }

            System.out.println(personDatabase.getPerson(Integer.parseInt(id)).toString());

        }
    }
}
