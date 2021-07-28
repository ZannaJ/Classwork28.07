package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // Queue
        // A queue is a collection interface that allows us to implement FIFO and LIFO
        // FIFO - First-In-First-Out.
        // LIFO - Last-In-First-Out.
//        Queue<String> names = new LinkedList<>();
//        Queue<String> people = new LinkedList<>();
//        names.offer("Josh");
//        names.offer("Harry");
//        names.offer("David");
//        names.offer("George");
//        System.out.println(names.element()); // returns an element from the front of the queue
//        System.out.println(people.peek()); // does the same thing as the element() method but doesnt throw
//        // an error on an empty queue
//
//        names.remove(); // removes an item from the front of the queue
//        names.poll(); // poll does the same thing as the remove method, except it doesnt throw an errot
//        // when faced with an empty queue.names.offer("Josh");

        // The deque is an collection interface  that allows us to manipulate items to the top and
        // bottom of the deque

//        Deque<String> names = new ArrayDeque<>();
////        names.addFirst("Josh"); // offerFirst();
////        names.add("Dave"); // offer();
////        names.addLast("Paul"); // offerLast();
////
////        System.out.println(names.remove());

        // Maps
        // A map is a collection interface that affords us a key-value pair relationship in a data structure.
        // HashMap returns the keys in a random format doesnt really care how you entered it, and doesnt bother
        //to organise them.
        // treeMap organises the keys in the natural ascending order. (irrespective of how they were added).
        // meaning strings are returned in alphabetic order. and numbers are returned in ascending order.

        // LinkedHashMap saves the manner in which the items are added and return them in that particular order
//        Map<String, String> countries = new LinkedHashMap<>();
//        countries.put("Nigeria", "Abuja"); // use the put() method of the Map interface to add a new item to the map
//        countries.put("USA", "Washington D.C.");
//        countries.put("China", "Hong Kong");
//        countries.put("Japan", "Tokyo");
//
//        System.out.println(countries.keySet());
//        System.out.println(countries.values());
//
//        for (String country : countries.keySet()) {
//            System.out.println("The capital of " + country + " is " + countries.get(country));
//        }

        // Task: 1
        // Write a program that uses a Map to uniquely categorise animals and the sound they make.

        // Task 2:
        // Write a program that uses a Map to uniquely categorise wild animals and the names for their kids

        Map<String, String> animals = new HashMap<>();
        animals.put("Tiger", "Roar");
        animals.put("Cat", "Meow");
        animals.put("Snake", "Sssss");
        animals.put("Cow", "Mooo");
        animals.put("Dog", "Gav");



        for (String animal : animals.keySet()) {
           System.out.println(animal + " makes " + animals.get(animal));
        }
        // Task 2
        Map<String, String> wildAnimals = new LinkedHashMap<>();
        wildAnimals.put("Monkey", "Baby monkey");
        wildAnimals.put("Elephant", "Baby elephant");
        wildAnimals.put("Tiger", "Baby Tiger");
        wildAnimals.put("Crocodile", "Baby crocodile");

        for (String wildAnimal : wildAnimals.keySet()) {
            System.out.println(wildAnimal + " has a " + wildAnimals.get(wildAnimal));
        }
    }
}
