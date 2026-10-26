package org.example.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDemo {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);

        System.out.println("Before Sorting:");
        a.forEach(k -> {
            System.out.println(k);
        });

        new SortDemo().usingComparator(a);

        System.out.println("After Sorting:");
        a.forEach(k -> {
            System.out.println(k);
        });

        System.out.println("*************************************************");

        ArrayList<String> b = new ArrayList<>();
        b.add("soni");
        b.add("raj");
        b.add("bhagya");

        System.out.println("Before Sorting:");
        b.forEach(k -> {
            System.out.println(k);
        });

        new SortDemo().usingComparable(b);

        System.out.println("After Sorting:");
        b.forEach(k -> {
            System.out.println(k);
        });
    }

    private void usingComparable(ArrayList<String> b) {

        Collections.sort(b, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    private void usingComparator(ArrayList<Integer> a) {

        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

    }
}
