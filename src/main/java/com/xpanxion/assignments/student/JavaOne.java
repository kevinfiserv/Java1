package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {
    }

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Student 1: ex1.");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = console.nextLine();

        System.out.println("\nYour name in upper case is: " + name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string:");
        String sentence = console.nextLine();

        System.out.println(
                "\n Number of uppercase letters: " + sentence.chars().filter((s) -> Character.isUpperCase(s)).count());
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");

        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string:");
        String sentence = console.nextLine();
        String[] sentenceArray = sentence.split(" ");

        int i = 0;
        for (String string : sentenceArray) {
            if (i % 2 == 0) {
                sentenceArray[i] = string.toUpperCase();
            }
            i++;
        }
        System.out.println(String.join(" ", sentenceArray));

    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string:");
        String sentence = console.nextLine();

        StringBuilder backwards = new StringBuilder();
        backwards.append(sentence).reverse();

        if (sentence.equals(backwards.toString())) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");

        String sentence;
        String vowels = "AEIOU";

        do {
            Scanner console = new Scanner(System.in);
            System.out.print("Enter a string:");
            sentence = console.nextLine().toUpperCase();

            int vowelCounter = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (vowels.contains(Character.toString(sentence.charAt(i)))) {
                    vowelCounter++;
                }
            }
            System.out.println("Number of vowels: " + vowelCounter);
            String[] sentenceArray = sentence.split(" ");
            System.out.println("Number of consonants: " + (String.join("", sentenceArray).length() - vowelCounter));

        } while (!sentence.equals("quit"));
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");

        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = console.nextInt();
        System.out.print("Enter second number: ");
        int y = console.nextInt();

        System.out.println("Result: " + (x + y));
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");

        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = console.nextInt();
        System.out.print("Enter second number: ");
        int y = console.nextInt();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = console.next();

        switch (operation) {
            case "add":
                System.out.println("Result: " + (x + y));
                break;
            case "sub":
                System.out.println("Result: " + (x - y));
                break;
            case "mul":
                System.out.println("Result: " + (x * y));
                break;
            case "div":
                System.out.println("Result: " + (x / y));
                break;
            default:
                break;
        }
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");

        Scanner console = new Scanner(System.in);
        System.out.print("Enter price per square feet: ");
        int price = console.nextInt();
        int totalDimensions = 1;
        String dimensions;

        ArrayList<Integer> sumOfDimensions = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();

        while (true) {
            dimensions = "";
            System.out.println("Enter room dimensions (width x height): ");
            totalDimensions = 1;

            dimensions = console.next();

            if (dimensions.equals("done")) {
                break;
            }

            String[] dimensionsArray = dimensions.split(" ");

            for (int i = 0; i < dimensionsArray.length; i++) {
                if (!Character.isAlphabetic(dimensionsArray[i].charAt(0))) {

                    temp.add(Integer.parseInt(dimensionsArray[i]));
                }
            }

            for (int num : temp) {
                totalDimensions *= num;
            }

            sumOfDimensions.add(totalDimensions);

        }

        System.out.println("Total cost: " + sumOfDimensions.stream().mapToInt(s -> s
                * price).sum());
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");

        Scanner console = new Scanner(System.in);
        int num;
        Random randomGenerator = new Random();
        int randomNum = randomGenerator.nextInt(1, 5);

        while (true) {
            System.out.print("Enter a number: ");
            num = console.nextInt();
            if (num == randomNum) {
                System.out.println("You guessed it!!!");
                break;
            }
            System.out.println("Try again...");

        }
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");

        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = console.nextLine();

        String[] splitter = sentence.split(" ");
        String SPACE = " ";

        for (String word : splitter) {

            for (int i = 0; i < word.length(); i++) {
                System.out.print(SPACE.repeat(i));
                System.out.println(word.charAt(i));
            }
        }

    }

    //
    // Private helper methods
    //
}
