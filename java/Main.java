import java.util.*;
import java.io.*;
import java.util.stream.*;

// ===== PACKAGE & IMPORT =====
// package com.example; // organizes code into folders
// import java.util.ArrayList; // brings in code from other packages

// ===== MAIN CLASS =====
public class Main {
    public static void main(String[] args) {

        // ===== ARRAYLIST =====
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.remove(0);
        System.out.println("ArrayList: " + list); // [Banana]

        // ===== LINKEDLIST =====
        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(1);
        linked.addFirst(0);
        linked.addLast(2);
        System.out.println("LinkedList: " + linked); // [0, 1, 2]

        // ===== HASHMAP =====
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println("HashMap: " + map.get("Alice")); // 25

        // ===== HASHSET =====
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // duplicate, won't be added
        System.out.println("HashSet: " + set); // [A, B]

        // ===== STACK =====
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        System.out.println("Stack pop: " + stack.pop()); // Second (LIFO)

        // ===== QUEUE =====
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue poll: " + queue.poll()); // First (FIFO)

        // ===== NEW & INSTANCEOF =====
        Person p = new Person("Lenix", 20); // 'new' creates object
        if (p instanceof Person) { // checks type
            System.out.println("p is a Person");
        }

        // ===== CONSTRUCTOR =====
        Student s = new Student("Alice", 18, "MIT");
        System.out.println("Student: " + s.name + ", " + s.school);

        // ===== ABSTRACTION =====
        Dog dog = new Dog();
        dog.sound(); // Bark!

        // ===== POLYMORPHISM =====
        Calculator calc = new Calculator();
        System.out.println("Add int: " + calc.add(5, 3)); // 8
        System.out.println("Add double: " + calc.add(5.5, 3.2)); // 8.7

        // ===== STATIC & FINAL =====
        Config.increment();
        System.out.println("Count: " + Config.count); // 1

        // ===== GENERICS =====
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("Box: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Box: " + intBox.get());

        // ===== LAMBDA =====
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(n -> System.out.print(n + " ")); // 1 2 3 4 5
        System.out.println();
    }
}