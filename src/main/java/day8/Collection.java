package day8;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // List - Array - Allow Duplicate
        // Set - No Index - No Duplicate
        //
        //

        arrayListDemo();
        hashSetDemo();
        listDemo();
        queueDemo();
    }

    //ArrayList
    static void arrayListDemo(){
        ArrayList<String> list = new ArrayList<>(); // No size limit
        list.add("Ahmed");
        list.add("Ahmed");
        list.add("Marwa");
        list.add("Sasa");
        list.add("Doha");

        System.out.println(list);
        System.out.println(list.get(2));   // Marwa
        System.out.println(list.size());    // 5
//        System.out.println(list.getFirst()); // Ahmed
//        System.out.println(list.getLast());  // Doha

        list.remove("Ahmed"); // removes first occurrence of "Ahmed"
        list.remove(3);
        System.out.println(list);
//
//        for (String s : list)
//            System.out.println(s);

        // Lambda Express
        list.forEach(s -> System.out.println());
        list.forEach(System.out::println);

        System.out.println(list.contains("Marwa")); // true

        /*
        - Dynamic sizing ✅
        - Methods: add(), get(), remove(), size(), contains()
        - Enhanced for-loop works seamlessly.
        */
    }
    // HashSet
    static void hashSetDemo(){
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println(colors);  //[Red, Blue, Green] - no duplicates
    }

    // List => ArrayList, LinkedList, Vector, Stack
    static void listDemo()
    {
        LinkedList<Object> items = new LinkedList<>();
        items.add("Apple");
        items.add(2);
        items.add(2.0);
        items.add(true);

        System.out.println(items);

        System.out.println(items);
        System.out.println(items.get(2));   // Marwa
        System.out.println(items.size());    // 5
        System.out.println(items.getFirst()); // Ahmed
        System.out.println(items.getLast());  // Doha
    }

    // PriorityQueue
    static void queueDemo()
    {
        Queue<Object> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add("Route");
        q.add(4);
        q.add("Java");
        q.add("Java");

        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.remove()); // 1
        System.out.println(q.remove()); // 2
        System.out.println(q.peek()); // shows duplicate of head without removing it
        System.out.println(q.poll()); // shows first element

        q.add("Testing");
        System.out.println(q);

//        q.addAll(List.of("A", "B", "C"));
//        System.out.println(q);
    }

}
